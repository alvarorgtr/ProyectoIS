package empleado.capadepresentacion.vista;

import empleado.capadepresentacion.vista.gestoreventos.VistaAniadirEmpleadoListener;

public abstract class VistaAniadirEmpleado implements VistaGenerica {
	
	VistaAniadirEmpleadoListener listener;
	
	@Override
	public void mostrarVista() {
		// TODO Ap�ndice de m�todo generado autom�ticamente

	}

	@Override
	public void ocultarVista() {
		// TODO Ap�ndice de m�todo generado autom�ticamente

	}

	public void aniadirEmpleadoPulsado(){
		listener.aniadirEmpleadoPulsado();
	}
}
