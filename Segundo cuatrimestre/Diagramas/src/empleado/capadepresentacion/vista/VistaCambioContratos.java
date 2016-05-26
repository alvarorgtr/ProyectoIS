package empleado.capadepresentacion.vista;

import empleado.capadenegocio.reglas.Contrato;
import empleado.capadenegocio.reglas.Empleado;
import empleado.capadepresentacion.vista.gestoreventos.VistaCambioContratosListener;

public abstract class VistaCambioContratos implements VistaGenerica {
	VistaCambioContratosListener listener;
	private Empleado empleado;
	
	public VistaCambioContratos(VistaCambioContratosListener listener) {
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
	
	public void contratoCambiado() {
		Contrato nuevoContrato = leerNuevoContrato();
		listener.contratoCambiado(empleado, nuevoContrato);
	}
	
	protected abstract void actualizarInformacion();
	protected abstract Contrato leerNuevoContrato();
}
