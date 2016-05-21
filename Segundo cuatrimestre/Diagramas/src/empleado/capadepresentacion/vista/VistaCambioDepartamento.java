package empleado.capadepresentacion.vista;

import empleado.capadenegocio.reglas.EmpleadoPDI;
import empleado.capadepresentacion.vista.gestoreventos.VistaCambioDepartamentoListener;

public abstract class VistaCambioDepartamento implements VistaGenerica {
	private VistaCambioDepartamentoListener listener;
	private EmpleadoPDI empleado;
	
	public VistaCambioDepartamento(VistaCambioDepartamentoListener listener) {
		this.listener = listener;
	}
	
	public void setEmpleado(EmpleadoPDI empleado) {
		this.empleado = empleado;
		actualizarInformacion();
	}

	@Override
	public void mostrarVista() {

	}

	@Override
	public void ocultarVista() {

	}

	public void cambioDepartamento() {
		listener.cambioDepartamento(empleado, informacionNuevoDepartamento());
	}
	
	protected abstract void actualizarInformacion();
	protected abstract String informacionNuevoDepartamento();
}
