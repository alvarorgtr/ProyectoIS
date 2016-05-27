package empleado.capadepresentacion.vista.gestoreventos;

import usuario.capadenegocio.reglas.TipoFacultad;
import empleado.capadenegocio.reglas.AreaTrabajo;
import empleado.capadenegocio.reglas.Empleado;

public interface VistaAniadirEmpleadoListener extends BotonRetrocesoListener {
	public void empleadoAniadido(Empleado nuevoEmpleado);

	void buscarEmpleadoPulsado(String nombre, String apellido1,
			String apellido2, TipoFacultad facultad);

	void buscarEmpleadoPASPulsado(String nombre, String apellido1,
			String apellido2, TipoFacultad facultad, AreaTrabajo areaTrabajo);

	void buscarEmpleadoPDIPulsado(String nombre, String apellido1,
			String apellido2, String departamento, String despacho,
			TipoFacultad facultad);
}
