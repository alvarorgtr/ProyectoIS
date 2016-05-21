package empleado.capadenegocio.reglas;

public class EmpleadoPDI extends Empleado {

	private String departamento;
	private String especialidad;
	private String despacho;
	private TipoDocente tipoDocente;
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getDespacho() {
		return despacho;
	}
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	public TipoDocente getTipoDocente() {
		return tipoDocente;
	}
	public void setTipoDocente(TipoDocente tipoDocente) {
		this.tipoDocente = tipoDocente;
	}

}
