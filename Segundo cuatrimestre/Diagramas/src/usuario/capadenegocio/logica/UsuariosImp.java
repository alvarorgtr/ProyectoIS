package usuario.capadenegocio.logica;

import usuario.capadeintegracion.DAOUsuariosImp;
import usuario.capadenegocio.reglas.TipoFacultad;
import usuario.capadenegocio.reglas.TipoPermiso;
import usuario.capadenegocio.reglas.Usuario;
import usuario.capadenegocio.transferencia.TransferBoolean;
import usuario.capadenegocio.transferencia.TransferContrasenia;
import usuario.capadenegocio.transferencia.TransferFacultad;
import usuario.capadenegocio.transferencia.TransferID;
import usuario.capadenegocio.transferencia.TransferNombre;
import usuario.capadenegocio.transferencia.TransferPermiso;
import usuario.capadenegocio.transferencia.TransferUsuario;
import empleado.capadenegocio.transferencia.TransferPermisos;

public class UsuariosImp implements Usuarios {
	private String nombreLogueado;

	@Override
	public void aniadirUsuario(TransferUsuario us) {
		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		canal.aniadirUsuario(us);
	}

	@Override
	public void eliminarUsuario(TransferNombre nombre) {
		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		canal.eliminarUsuario(nombre);
	}

	@Override
	public void log(TransferID us) {
		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		canal.loging(us);
	}

	@Override
	public TransferBoolean userYaExiste(TransferNombre nombre) {
		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		return canal.yaExiste(nombre);
	}

	@Override
	public TransferBoolean comprobarContrasenia(TransferNombre nombre,
			TransferContrasenia contra) {
		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		String contrasenia = canal.getContra(nombre).getContrasenia();
		if (contra.equals(contrasenia)) {
			nombreLogueado = nombre.getNombre();
			return new TransferBoolean(true);
		} else {
			return new TransferBoolean(false);
		}
	}

	@Override
	public TransferBoolean comprobarPermiso(TransferPermiso permisoNecesario,
			TransferFacultad facultadNecesaria) {
		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		TransferNombre transfer = new TransferNombre(nombreLogueado);
		Usuario usuario = canal.getUsuario(transfer).getUser();

		return permisoValido(usuario, permisoNecesario.getPermiso(),
				facultadNecesaria.getFacultad());

	}

	private TransferBoolean permisoValido(Usuario usuario,
			TipoPermiso permisoNecesario, TipoFacultad facultadNecesaria) {
		return new TransferBoolean(true);
	}

	@Override
	public TransferUsuario consultarUsuario(TransferNombre nom) {
		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		return canal.getUsuario(nom);
	}

	@Override
	public TransferPermisos permisoUsuarioActual() {
		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		TransferUsuario usr = canal.getUsuario(new TransferNombre(
				nombreLogueado));
		TipoPermiso permiso = usr.getUser().getTipoPermiso();
		return new TransferPermisos(permiso);
	}

	@Override
	public TransferBoolean validarDatos() {
		// TODO Apéndice de método generado automáticamente
		return new TransferBoolean(false);
	}

	@Override
	public TransferBoolean datosRellenos() {
		// TODO Apéndice de método generado automáticamente
		return new TransferBoolean(false);
	}

	@Override
	public TransferBoolean conexionBaseDatos() {
		// TODO Apéndice de método generado automáticamente
		return new TransferBoolean(false);
	}

}
