package empleado.transferobjects;

import java.io.Serializable;

/**
 * Codifica la información de un empleado que se va a mostrar en la lista
 * (nombre, apellidos e id), sin incluir información específica.
 */
public class TransferEmpleadoVista implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int identifier; 
	private String nombre;
	private String apellido1;
	private String apellido2;
	
	public void setEmpleadoVista(int id, String nombre, String apellido1, String apellido2) {
		
	}
}
