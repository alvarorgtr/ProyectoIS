package empleado.capadepresentacion.vista;

import empleado.capadepresentacion.vista.gestoreventos.VistaEliminarEmpleadoListener;

public abstract class VistaEliminarEmpleado implements VistaGenerica {

	VistaEliminarEmpleadoListener listener;

	public VistaEliminarEmpleado(VistaEliminarEmpleadoListener listener) {
		this.listener = listener;
	}

	@Override
	public void mostrarVista() {
		// TODO Ap�ndice de m�todo generado autom�ticamente

	}

	@Override
	public void ocultarVista() {
		// TODO Ap�ndice de m�todo generado autom�ticamente

	}
	
	protected abstract int idEmpleadoAEliminar();
	
	public void eliminarEmpleadoPulsado(){
		listener.eliminarEmpleadoPulsado(idEmpleadoAEliminar());
	}

}
