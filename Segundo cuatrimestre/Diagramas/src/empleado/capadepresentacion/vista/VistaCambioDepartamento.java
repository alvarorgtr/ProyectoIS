package empleado.capadepresentacion.vista;

import empleado.capadepresentacion.vista.gestoreventos.VistaCambioDepartamentoListener;

public class VistaCambioDepartamento implements VistaGenerica {
	private VistaCambioDepartamentoListener listener;

	@Override
	public void mostrarVista() {

	}

	@Override
	public void ocultarVista() {

	}

	public void cambioDepartamento() {
		listener.cambioDepartamento();
	}
}
