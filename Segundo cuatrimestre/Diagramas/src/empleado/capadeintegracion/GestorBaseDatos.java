package empleado.capadeintegracion;

import empleado.capadenegocio.Empleado;
import java.lang.String;
import java.util.List;

public class GestorBaseDatos {

	private boolean abierta;
	private List<Empleado> listaEmplados;

	public Empleado consultarEmpleado(int idEmpleado) {
		return null;
	
	}

	public boolean abrirDatabase() {
		return abierta;
		
	}

	public boolean aņadirEmpleado(Empleado empleado) {
		return false;
	
	}

	public boolean eliminarEmpleado(int idEmpleado) {
		return false;
		
	}

	public Empleado busquedaEmpleado(String nombre) {
		return null;
	
	}

	public void guardarDatos() {
	
	}

}
