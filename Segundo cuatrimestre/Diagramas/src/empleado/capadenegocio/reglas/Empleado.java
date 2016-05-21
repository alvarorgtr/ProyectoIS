package empleado.capadenegocio.reglas;

public abstract class Empleado extends EmpleadoVista {
	private String path_foto;
	private String direccion;
	private String[] idiomas;
	private String historialPath;
	private String nominaPath;
	private Contrato contrato;
	private String curriculumPath;
	private TipoBaja tipoBaja;

	public String getPath_foto() {
		return path_foto;
	}

	public void setPath_foto(String path_foto) {
		this.path_foto = path_foto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String[] getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String[] idiomas) {
		this.idiomas = idiomas;
	}

	public String getHistorialPath() {
		return historialPath;
	}

	public void setHistorialPath(String historialPath) {
		this.historialPath = historialPath;
	}

	public String getNominaPath() {
		return nominaPath;
	}

	public void setNominaPath(String nominaPath) {
		this.nominaPath = nominaPath;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public String getCurriculumPath() {
		return curriculumPath;
	}

	public void setCurriculumPath(String curriculumPath) {
		this.curriculumPath = curriculumPath;
	}

	public TipoBaja getTipoBaja() {
		return tipoBaja;
	}

	public void setTipoBaja(TipoBaja tipoBaja) {
		this.tipoBaja = tipoBaja;
	}
}
