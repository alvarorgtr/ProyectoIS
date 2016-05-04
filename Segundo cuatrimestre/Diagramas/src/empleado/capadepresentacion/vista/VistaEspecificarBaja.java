package empleado.capadepresentacion.vista;

import empleado.capadepresentacion.vista.gestoreventos.VistaEspecificarBajaListener;

public class VistaEspecificarBaja implements VistaGenerica {
	VistaEspecificarBajaListener listener;

	@Override
	public void mostrarVista() {
	}

	@Override
	public void ocultarVista() {
	}
	
	public void darDeBaja() {
		listener.darDeBaja();
	}
	
	public void cancelarBaja() {
		listener.cancelarBaja();
	}
}
