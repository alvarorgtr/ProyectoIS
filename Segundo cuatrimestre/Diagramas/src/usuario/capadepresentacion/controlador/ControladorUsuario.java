package usuario.capadepresentacion.controlador;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import usuario.capadenegocio.logica.UsuariosImp;
import usuario.capadenegocio.reglas.Conserje;
import usuario.capadenegocio.reglas.Memento;
import usuario.capadenegocio.reglas.TipoPermiso;
import usuario.capadenegocio.reglas.Usuario;
import usuario.capadenegocio.transferencia.TransferID;
import usuario.capadenegocio.transferencia.TransferNombre;
import usuario.capadenegocio.transferencia.TransferUsuario;
import usuario.capadepresentacion.vista.VistaActividad;
import usuario.capadepresentacion.vista.VistaActividadListener;
import usuario.capadepresentacion.vista.VistaAniadirUsuario;
import usuario.capadepresentacion.vista.VistaAniadirUsuarioListener;
import usuario.capadepresentacion.vista.VistaEliminarUsuario;
import usuario.capadepresentacion.vista.VistaEliminarUsuarioListener;
import usuario.capadepresentacion.vista.VistaLoginUsuario;
import usuario.capadepresentacion.vista.VistaLoginUsuarioListener;
import empleado.capadenegocio.logica.ImplementacionEmpleados;
import empleado.capadepresentacion.controlador.Controlador;
import empleado.capadepresentacion.controlador.FactoriaVistas;
import empleado.capadepresentacion.vista.VistaGenerica;

public class ControladorUsuario implements VistaActividadListener,
		VistaAniadirUsuarioListener, VistaEliminarUsuarioListener,
		VistaLoginUsuarioListener {

	private UsuariosImp servicioAplicacionUsuarios;
	private FactoriaVistasUsuario factoria;
	private Controlador controlerEmpleados;
	private Stack<VistaGenerica> lista;
	private Conserje cons;

	public ControladorUsuario(UsuariosImp sua, FactoriaVistasUsuario factUser,
			ImplementacionEmpleados imP, FactoriaVistas fact) {
		this.servicioAplicacionUsuarios = sua;
		this.factoria = factUser;
		controlerEmpleados = new Controlador(imP, fact);
		lista = new Stack<VistaGenerica>();
	}

	@Override
	public void inicioSesion() {
		VistaLoginUsuario vista = factoria.vistaLoginUsuario(this);
		mostrarVista(vista);
		if (servicioAplicacionUsuarios.comprobarContrasenia(vista.getNombre(),
				vista.getContrasenia())) {
			TransferID user = new TransferID(vista.getNombre(),
					vista.getContrasenia());
			servicioAplicacionUsuarios.log(user);
			ocultarUltimaVista();
			VistaActividad vista2 = factoria.vistaActividad(this);
			mostrarVista(vista2);
		} else {
			// Tratar error
		}
	}

	@Override
	public void aniadir(Usuario us) {
		if (servicioAplicacionUsuarios.validarDatos()
				&& servicioAplicacionUsuarios.datosRellenos()) {
			if (!servicioAplicacionUsuarios.userYaExiste(us.getNombre())
					&& servicioAplicacionUsuarios.comprobarPermiso(
							TipoPermiso.permisoSuperior(us.getTipoPermiso()),
							us.getTipoFacultad())) {
				TransferUsuario user = new TransferUsuario(us);
				if (servicioAplicacionUsuarios.conexionBaseDatos()) {
					servicioAplicacionUsuarios.aniadirUsuario(user);
					ocultarUltimaVista();
				} else {
					// Error
				}
			} else {
				// Error
			}
		} else {
			// Error
		}
	}

	@Override
	public void eliminar(String nombre) {
		TransferNombre nom = new TransferNombre(nombre);
		Usuario usuarioAEliminar = servicioAplicacionUsuarios
				.consultarUsuario(nom);

		if (servicioAplicacionUsuarios.comprobarPermiso(
				TipoPermiso.permisoSuperior(usuarioAEliminar.getTipoPermiso()),
				usuarioAEliminar.getTipoFacultad())) {

			cons.setMemento(new Memento(usuarioAEliminar));
			servicioAplicacionUsuarios.eliminarUsuario(nom);
			if (!estasSeguro()) {
				descartar();
			}
			ocultarUltimaVista();
		} else {
			// Error
		}
	}

	private void descartar() {
		Memento usuarioAntiguo = cons.getMemento();
		TransferUsuario user = new TransferUsuario(usuarioAntiguo.getUsuario());
		servicioAplicacionUsuarios.aniadirUsuario(user);
	}

	private boolean estasSeguro() {
		Object[] options = { "Guardar", "Descartar" };
		int n = JOptionPane.showOptionDialog(new JFrame(), "¿Estás seguro?",
				"Eliminar", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		if (n == 0)
			return true;
		return false;

	}

	@Override
	public void vistaAniadirUsuario() {
		VistaAniadirUsuario vista = factoria.vistaAniadirUsuario(this);
		mostrarVista(vista);
	}

	@Override
	public void vistaEliminarUsuario() {
		VistaEliminarUsuario vista = factoria.vistaEliminarUsuario(this);
		mostrarVista(vista);
	}

	@Override
	public void vistaAccesoEmpleados() {
		controlerEmpleados.lanzar();
	}

	@Override
	public void BotonRetrocesoPulsado() {
		ocultarUltimaVista();
	}

	private void mostrarVista(VistaGenerica vista) {
		lista.add(vista);
		vista.mostrarVista();
	}

	private void ocultarUltimaVista() {
		if (!lista.isEmpty()) {
			VistaGenerica vista = lista.pop();
			vista.ocultarVista();
		}
	}

	public void logout() {
		for (int i = 0; i < lista.size(); i++)
			ocultarUltimaVista();
		mostrarVista(factoria.vistaLoginUsuario(this));

	}

}
