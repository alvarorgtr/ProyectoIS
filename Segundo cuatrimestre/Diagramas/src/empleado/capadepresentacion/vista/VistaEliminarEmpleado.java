package empleado.capadepresentacion.vista;

import empleado.capadenegocio.reglas.Empleado;
import empleado.capadepresentacion.vista.gestoreventos.VistaEliminarEmpleadoListener;

public abstract class VistaEliminarEmpleado implements VistaGenerica {
	private VistaEliminarEmpleadoListener listener;
	private Empleado empleado;

	public VistaEliminarEmpleado(VistaEliminarEmpleadoListener listener) {
		this.listener = listener;
	}
	
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
		actualizarInformacion();
	}

	public abstract void mostrarVista();
	
	public abstract void ocultarVista();
		
	public void eliminarEmpleadoPulsado(){
		listener.eliminarEmpleadoPulsado(empleado.getIdentifier());
	}

	protected abstract void actualizarInformacion();
}
