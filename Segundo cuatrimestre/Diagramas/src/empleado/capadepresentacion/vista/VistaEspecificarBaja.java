package empleado.capadepresentacion.vista;

import empleado.capadenegocio.TipoBaja;
import empleado.capadepresentacion.vista.gestoreventos.VistaEspecificarBajaListener;

public abstract class VistaEspecificarBaja implements VistaGenerica {
	VistaEspecificarBajaListener listener;

	@Override
	public void mostrarVista() {
		
	}

	@Override
	public void ocultarVista() {
		
	}
	
	protected abstract int idEmpleadoBaja();
	
	protected abstract TipoBaja tipoBajaEmpleado();
	
	public void darDeBaja() {
		listener.darDeBaja(idEmpleadoBaja(), tipoBajaEmpleado());
	}
	
	public void cancelarBaja() {
		listener.cancelarBaja(idEmpleadoBaja());
	}
}
