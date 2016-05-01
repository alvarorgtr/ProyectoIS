package empleado.capadenegocio;


import java.lang.String;
public abstract class Empleado {

	private int identifier; 
	protected String nombre;
	protected String apellido1;
	protected String apellido2;
	protected String path_foto;
	protected String direccion;
	private String[] idiomas;
	private String historialPath;
	private String nominaPath;
	private Contrato contrato;
	private String curriculumPath;
	private TipoBaja bajaEmpleado;
	
}
