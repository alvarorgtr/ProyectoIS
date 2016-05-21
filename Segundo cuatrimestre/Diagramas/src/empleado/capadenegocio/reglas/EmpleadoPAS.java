package empleado.capadenegocio.reglas;

public class EmpleadoPAS extends Empleado {

	private AreaTrabajo areaTrabajo;
	private String categoria;
	public AreaTrabajo getAreaTrabajo() {
		return areaTrabajo;
	}
	public void setAreaTrabajo(AreaTrabajo areaTrabajo) {
		this.areaTrabajo = areaTrabajo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
