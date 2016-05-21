package empleado.capadepresentacion.controlador;

import java.util.Stack;

import usuario.capadenegocio.TipoFacultad;
import empleado.capadenegocio.logica.Empleados;
import empleado.capadenegocio.reglas.Contrato;
import empleado.capadenegocio.reglas.Empleado;
import empleado.capadenegocio.reglas.TipoBaja;
import empleado.capadepresentacion.vista.VistaGenerica;
import empleado.capadepresentacion.vista.gestoreventos.VistaAniadirEmpleadoListener;
import empleado.capadepresentacion.vista.gestoreventos.VistaCambioContratosListener;
import empleado.capadepresentacion.vista.gestoreventos.VistaCambioDepartamentoListener;
import empleado.capadepresentacion.vista.gestoreventos.VistaEliminarEmpleadoListener;
import empleado.capadepresentacion.vista.gestoreventos.VistaEspecificarBajaListener;
import empleado.capadepresentacion.vista.gestoreventos.VistaFichaEmpleadoListener;
import empleado.capadepresentacion.vista.gestoreventos.VistaListaEmpleadosListener;
import empleado.capadepresentacion.vista.gestoreventos.VistaTrasladoFacultadListener;

public class Controlador implements VistaAniadirEmpleadoListener,
		VistaCambioContratosListener, VistaCambioDepartamentoListener,
		VistaEliminarEmpleadoListener, VistaEspecificarBajaListener,
		VistaFichaEmpleadoListener, VistaListaEmpleadosListener,
		VistaTrasladoFacultadListener {
	
	private Empleados empleados;
	
	private Stack<VistaGenerica> vistasPresentadas;
	
	public Controlador(Empleados empleados) {
		this.empleados = empleados;
		vistasPresentadas = new Stack<VistaGenerica>();
	}

	public void avanzarAVista(VistaGenerica vista) {
		mostrarVista(vista);
	}
	
	public void retrocederAVistaAnterior() {
		if (!vistasPresentadas.isEmpty()) {
			ocultarUltimaVista();
		}
	}
	
	// EVENT LISTENERS
	@Override
	public void trasladoFacultad(TipoFacultad facultad) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void empleadoSeleccionado(int idEmpleado) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void cambiarContratoPulsado() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void especificarBajaPulsado() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void especificarTrasladoPulsado() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void especificarCambioDepartamentoPulsado() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void eliminarFichaPulsado() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void darDeBaja(int idEmpleado, TipoBaja baja) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void cancelarBaja(int idEmpleado) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void eliminarEmpleadoPulsado(int id) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void cambioDepartamento(String departamento) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void cotratoCambiado(Contrato contrato) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void aniadirEmpleadoPulsado(Empleado empleado) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	// HELPERS PRIVADOS
	private void mostrarVista(VistaGenerica vista) {
		vistasPresentadas.add(vista);
		vista.mostrarVista();
	}
	
	private void ocultarUltimaVista() {
		VistaGenerica vista = vistasPresentadas.pop();
		vista.ocultarVista();
	}
}


