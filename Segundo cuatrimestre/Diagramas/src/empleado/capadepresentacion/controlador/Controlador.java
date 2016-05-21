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
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void empleadoSeleccionado(int idEmpleado) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void cambiarContratoPulsado() {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void especificarBajaPulsado() {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void especificarTrasladoPulsado() {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void especificarCambioDepartamentoPulsado() {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void eliminarFichaPulsado() {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void darDeBaja(int idEmpleado, TipoBaja baja) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void cancelarBaja(int idEmpleado) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void eliminarEmpleadoPulsado(int id) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void cambioDepartamento(String departamento) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void cotratoCambiado(Contrato contrato) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void aniadirEmpleadoPulsado(Empleado empleado) {
		// TODO Apéndice de método generado automáticamente
		
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


