package empleado.capadepresentacion.vista;

import usuario.capadenegocio.TipoFacultad;
import empleado.capadepresentacion.vista.gestoreventos.VistaTrasladoFacultadListener;

public abstract class VistaTrasladoFacultad implements VistaGenerica {
	VistaTrasladoFacultadListener listener;

	@Override
	public void mostrarVista() {

	}

	@Override
	public void ocultarVista() {

	}
	
	protected abstract TipoFacultad tipoFacultadBaja();

	void trasladoFacultad() {
		listener.trasladoFacultad(tipoFacultadBaja());
	}
}
