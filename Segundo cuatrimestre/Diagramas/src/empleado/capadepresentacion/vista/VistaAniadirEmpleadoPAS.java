package empleado.capadepresentacion.vista;

import empleado.capadepresentacion.vista.gestoreventos.VistaAniadirEmpleadoListener;


public abstract class VistaAniadirEmpleadoPAS extends VistaAniadirEmpleado{
	public VistaAniadirEmpleadoPAS(VistaAniadirEmpleadoListener listener) {
		super(listener);
	}

	public void aniadirEmpleadoPulsado(){
		super.aniadirEmpleadoPulsado();
	}
}
