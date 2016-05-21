package empleado.capadepresentacion.vista;

import empleado.capadepresentacion.vista.gestoreventos.VistaAniadirEmpleadoListener;


public abstract class VistaAniadirEmpleadoPDI extends VistaAniadirEmpleado {
	public VistaAniadirEmpleadoPDI(VistaAniadirEmpleadoListener listener) {
		super(listener);
	}

	public void aniadirEmpleadoPulsado(){
		super.aniadirEmpleadoPulsado();
	}
}
