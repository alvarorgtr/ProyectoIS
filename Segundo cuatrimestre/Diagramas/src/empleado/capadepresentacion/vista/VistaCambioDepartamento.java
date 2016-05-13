package empleado.capadepresentacion.vista;

import empleado.capadepresentacion.vista.gestoreventos.VistaCambioDepartamentoListener;

public abstract class VistaCambioDepartamento implements VistaGenerica {
	private VistaCambioDepartamentoListener listener;

	@Override
	public void mostrarVista() {

	}

	@Override
	public void ocultarVista() {

	}
	
	protected abstract String informacionNuevoDepartamento();

	public void cambioDepartamento() {
		listener.cambioDepartamento(informacionNuevoDepartamento());
	}
}
