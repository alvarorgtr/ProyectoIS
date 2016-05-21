package empleado.capadepresentacion.vista;

import empleado.capadenegocio.reglas.Empleado;
import empleado.capadenegocio.reglas.TipoBaja;
import empleado.capadepresentacion.vista.gestoreventos.VistaEspecificarBajaListener;

public abstract class VistaEspecificarBaja implements VistaGenerica {
	VistaEspecificarBajaListener listener;

	private Empleado empleado;
	
	public VistaEspecificarBaja(VistaEspecificarBajaListener listener) {
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
		
	public void darDeBaja() {
		listener.darDeBaja(empleado, leerTipoBaja());
	}
	
	public void cancelarBaja() {
		listener.cancelarBaja(empleado);
	}
	
	protected abstract void actualizarInformacion();
	protected abstract TipoBaja leerTipoBaja();
}
