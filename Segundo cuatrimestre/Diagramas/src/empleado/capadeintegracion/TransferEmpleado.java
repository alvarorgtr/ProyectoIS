package empleado.capadeintegracion;

import empleado.capadenegocio.Contrato;
import empleado.capadenegocio.TipoBaja;
import empleado.capadeintegracion.DAOEmpleados;

public class TransferEmpleado {
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
