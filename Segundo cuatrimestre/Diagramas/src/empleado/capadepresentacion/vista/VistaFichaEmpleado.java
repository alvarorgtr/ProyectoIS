package empleado.capadepresentacion.vista;

import empleado.capadepresentacion.vista.gestoreventos.VistaFichaEmpleadoListener;

public class VistaFichaEmpleado implements VistaGenerica {
	VistaFichaEmpleadoListener listener;
	
	public VistaFichaEmpleado(VistaFichaEmpleadoListener listener) {
		this.listener = listener;
	}
	
	@Override
	public void mostrarVista() {
		
	}

	@Override
	public void ocultarVista() {
		
	}

	/* ACCIONES */
	public void cambiarContratoPulsado() {
		listener.cambiarContratoPulsado();
	}
	
	public void especificarBajaPulsado() {
		listener.especificarBajaPulsado();
	}
	
	public void especificarTrasladoPulsado() {
		listener.especificarTrasladoPulsado();
	}
	
	public void especificarCambioDepartamentoPulsado() {
		listener.especificarCambioDepartamentoPulsado();
	}
	
	public void eliminarFicheroPulsado() {
		listener.eliminarFicheroPulsado();
	}
}
