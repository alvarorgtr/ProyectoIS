package empleado.capadepresentacion.vista;

import empleado.capadenegocio.reglas.Empleado;
import empleado.capadepresentacion.vista.gestoreventos.VistaFichaEmpleadoListener;

public abstract class VistaFichaEmpleado implements VistaGenerica {
	private VistaFichaEmpleadoListener listener;
	private Empleado empleado;
	
	public VistaFichaEmpleado(VistaFichaEmpleadoListener listener) {
		this.listener = listener;
	}
	
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
		actualizarInformacion();
	}
	
	@Override
	public void mostrarVista() {
		
	}

	@Override
	public void ocultarVista() {
		
	}

	/* ACCIONES */
	public void cambiarContratoPulsado() {
		listener.cambiarContratoPulsado(empleado);
	}
	
	public void especificarBajaPulsado() {
		listener.especificarBajaPulsado(empleado);
	}
	
	public void especificarTrasladoPulsado() {
		listener.especificarTrasladoPulsado(empleado);
	}
	
	public void especificarCambioDepartamentoPulsado() {
		listener.especificarCambioDepartamentoPulsado(empleado);
	}
	
	public void eliminarFichaPulsado() {
		listener.eliminarFichaPulsado(empleado);
	}
	
	protected abstract void actualizarInformacion();
}
