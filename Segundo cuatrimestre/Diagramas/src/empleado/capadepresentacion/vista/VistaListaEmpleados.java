package empleado.capadepresentacion.vista;

import java.util.ArrayList;
import java.util.List;

import empleado.capadenegocio.reglas.EmpleadoVista;
import empleado.capadepresentacion.vista.gestoreventos.VistaListaEmpleadosListener;

public abstract class VistaListaEmpleados implements VistaGenerica {
	private VistaListaEmpleadosListener listener;
	private List<EmpleadoVista> empleados;
	private int pagina;
	
	public VistaListaEmpleados(VistaListaEmpleadosListener listener) {
		this.listener = listener;
		this.empleados = new ArrayList<EmpleadoVista>();
		this.pagina = 0;
	}
	
	public List<EmpleadoVista> getEmpleados() {
		return empleados;
	}

	@Override
	public void mostrarVista() {
		
	}

	@Override
	public void ocultarVista() {
		
	}
	
	public void actualizarPagina(List<EmpleadoVista> empleados, int nuevaPagina) {
		this.empleados = empleados;
		this.pagina = nuevaPagina;
		actualizarContenidoMostrado();
	}
	
	// LISTENERS
	public void empleadoSeleccionado(int idEmpleado) {
		listener.empleadoSeleccionado(idEmpleado);
	}

	public void mostrarPaginaSiguiente() {
		listener.mostrarNuevaPagina(pagina + 1);
	}
	
	public void mostrarPaginaAnterior() {
		listener.mostrarNuevaPagina(pagina - 1);
	}
	
	// HELPERS PRIVADOS
	protected abstract void actualizarContenidoMostrado();
}
