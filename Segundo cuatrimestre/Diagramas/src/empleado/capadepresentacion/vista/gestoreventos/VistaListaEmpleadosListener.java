package empleado.capadepresentacion.vista.gestoreventos;


public interface VistaListaEmpleadosListener {
	public void empleadoSeleccionado(int idEmpleado);
	public void mostrarNuevaPagina(int pagina);
	public void aniadirEmpleadoPASPulsado();
	public void aniadirEmpleadoPDIPulsado();
}
