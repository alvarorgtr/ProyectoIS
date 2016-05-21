package empleado.capadepresentacion.vista.gestoreventos;

import empleado.capadenegocio.reglas.Empleado;

public interface VistaListaEmpleadosListener {
	public void empleadoSeleccionado(int idEmpleado);
	public void mostrarNuevaPagina(int pagina);
	public void aniadirEmpleadoPASPulsado();
	public void aniadirEmpleadoPDIPulsado();
}
