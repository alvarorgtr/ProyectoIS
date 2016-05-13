package empleado.capadepresentacion.vista;

import empleado.capadenegocio.Empleado;
import empleado.capadepresentacion.vista.gestoreventos.VistaAniadirEmpleadoListener;

public abstract class VistaAniadirEmpleado implements VistaGenerica {
	
	VistaAniadirEmpleadoListener listener;
	
	@Override
	public void mostrarVista() {
		
	}

	@Override
	public void ocultarVista() {
		
	}
	
	/**
	 * Recoge de la vista la información necesaria para crear un
	 * empleado y la encapsula. 
	 * @return el empleado encapsulado.
	 */
	protected abstract Empleado informacionNuevoEmpleado();

	public void aniadirEmpleadoPulsado(){
		listener.aniadirEmpleadoPulsado(informacionNuevoEmpleado());
	}
}
