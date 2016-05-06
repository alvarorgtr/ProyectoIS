package empleado.capadepresentacion.vista;

import empleado.capadepresentacion.vista.gestoreventos.VistaEliminarEmpleadoListener;

public class VistaEliminarEmpleado implements VistaGenerica {

	VistaEliminarEmpleadoListener listener;

	public VistaEliminarEmpleado(VistaEliminarEmpleadoListener listener) {
		this.listener = listener;
	}

	@Override
	public void mostrarVista() {
		// TODO Apéndice de método generado automáticamente

	}

	@Override
	public void ocultarVista() {
		// TODO Apéndice de método generado automáticamente

	}
	
	public void eliminarEmpleadoPulsado(){
		listener.eliminarEmpleadoPulsado();
	}

}
