package empleado.capadepresentacion.vista.gestoreventos;

import usuario.capadenegocio.reglas.TipoFacultad;
import empleado.capadenegocio.reglas.AreaTrabajo;


public interface VistaListaEmpleadosListener {
	public void empleadoSeleccionado(int idEmpleado);
	public void mostrarNuevaPagina(int pagina);
	public void aniadirEmpleadoPASPulsado();
	public void aniadirEmpleadoPDIPulsado();
	public void buscarEmpleadoPulsado(String nombre, String apellido1, String apellido2, TipoFacultad facultad);
	public void buscarEmpleadoPASPulsado(String nombre, String apellido1,
			String apellido2, TipoFacultad facultad, AreaTrabajo areaTrabajo);
	public void buscarEmpleadoPDIPulsado(String nombre, String apellido1,
			String apellido2, String departamento, String despacho,
			TipoFacultad facultad);
}
