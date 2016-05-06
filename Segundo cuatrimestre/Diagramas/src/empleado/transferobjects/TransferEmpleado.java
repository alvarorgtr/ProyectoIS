package empleado.transferobjects;

import empleado.capadenegocio.Contrato;
import empleado.capadenegocio.TipoBaja;

public class TransferEmpleado {
	private int identifier; 
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String fotoPath;
	private String direccion;
	private String[] idiomas;
	private String historialPath;
	private String nominaPath;
	private Contrato contrato;
	private String curriculumPath;
	private TipoBaja bajaEmpleado;
	
	public TransferEmpleado(int identifier, String nombre, String apellido1, String apellido2,
			String fotoPath, String direccion, String[] idiomas, String historialPath,
			String nominaPath, Contrato contrato, String curriculumPath, TipoBaja bajaEmpleado) {
		
	}

	public int getId() {return identifier;}
	
	public String getNombre() {return null;}
	
	public String getApellido1() {return null;}
	
	public String getApellido2() {return null;}
	
	public String getFotoPath() {return null;}
	
	public String getDireccion() {return null;}
	
	public String[] getIdiomas() {return null;}
	
	public String getHistorialPath() {return null;}
	
	public String getNominalPath() {return null;}
	
	public Contrato getContrato() {return null;}
	
	public String getCurriculumPath() {return null;}
	
	public TipoBaja getTipoBaja() {return null;}

}
