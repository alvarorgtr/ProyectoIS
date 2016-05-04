package empleado.capadepresentacion.vista;

import empleado.capadepresentacion.vista.gestoreventos.VistaListaEmpleadosListener;

public class VistaListaEmpleados implements VistaGenerica {
	VistaListaEmpleadosListener listener;
	
	public VistaListaEmpleados(VistaListaEmpleadosListener listener) {
		this.listener = listener;
	}

	@Override
	public void mostrarVista() {
		
	}

	@Override
	public void ocultarVista() {
		
	}
	
	public void empleadoSeleccionado(int idEmpleado) {
		listener.empleadoSeleccionado(idEmpleado);
	}

}
