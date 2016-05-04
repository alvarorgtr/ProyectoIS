package empleado.capadepresentacion.vista;

import empleado.capadepresentacion.vista.gestoreventos.VistaTrasladoFacultadListener;

public class VistaTrasladoFacultad implements VistaGenerica {
	VistaTrasladoFacultadListener listener;

	@Override
	public void mostrarVista() {

	}

	@Override
	public void ocultarVista() {

	}
	
	void trasladoFacultad() {
		listener.trasladoFacultad();
	}
}
