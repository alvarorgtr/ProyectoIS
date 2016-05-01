package empleado.capadeintegracion;

import empleado.capadenegocio.Empleado;
import java.lang.String;
import java.util.List;

public class DatabaseManager {

	private boolean abierta;
	private List<Empleado> listaEmplados;

	public Empleado consultarEmpleado(int idEmpleado) {
		return null;
	
	}

	public boolean abrirDatabase() {
		return abierta;
		
	}

	public boolean añadirEmpleado(Empleado empleado) {
		return false;
	
	}

	public boolean eliminarEmpleado(int idEmpleado) {
		return false;
		
	}

	public Empleado busquedaUsuario(String nombre) {
		return null;
	
	}

	public void guardarDatos() {
	
	}

}
