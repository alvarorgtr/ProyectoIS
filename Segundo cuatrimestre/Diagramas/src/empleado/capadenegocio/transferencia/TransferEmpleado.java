package empleado.capadenegocio.transferencia;

import java.io.Serializable;

import usuario.capadenegocio.TipoFacultad;

import empleado.capadenegocio.reglas.Contrato;
import empleado.capadenegocio.reglas.TipoBaja;

/**
 * Codifica la información de un empleado al completo.
 */
public class TransferEmpleado implements Serializable {
	private static final long serialVersionUID = 1L;
	
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
	private TipoFacultad facultad;
	
	public TransferEmpleado(int identifier, String nombre, String apellido1, String apellido2,
			String fotoPath, String direccion, String[] idiomas, String historialPath, String nominaPath,
			Contrato contrato, String curriculumPath, TipoBaja bajaEmpleado, TipoFacultad facultad) {
		
	}

	public int getId() {return identifier;}
	
	public String getNombre() {return nombre;}
	
	public String getApellido1() {return apellido1;}
	
	public String getApellido2() {return apellido2;}
	
	public String getFotoPath() {return fotoPath;}
	
	public String getDireccion() {return direccion;}
	
	public String[] getIdiomas() {return idiomas;}
	
	public String getHistorialPath() {return historialPath;}
	
	public String getNominalPath() {return nominaPath;}
	
	public Contrato getContrato() {return contrato;}
	
	public String getCurriculumPath() {return curriculumPath;}
	
	public TipoBaja getTipoBaja() {return bajaEmpleado;}
	
	public TipoFacultad getFacultad() {return facultad;}

}
