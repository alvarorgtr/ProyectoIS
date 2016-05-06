package empleado.capadepresentacion.vista;

import empleado.capadepresentacion.vista.gestoreventos.VistaAniadirEmpleadoListener;

public abstract class VistaAniadirEmpleado implements VistaGenerica {
	
	VistaAniadirEmpleadoListener listener;
	
	@Override
	public void mostrarVista() {
		// TODO Apéndice de método generado automáticamente

	}

	@Override
	public void ocultarVista() {
		// TODO Apéndice de método generado automáticamente

	}

	public void aniadirEmpleadoPulsado(){
		listener.aniadirEmpleadoPulsado();
	}
}
