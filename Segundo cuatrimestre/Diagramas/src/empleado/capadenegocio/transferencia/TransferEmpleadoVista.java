package empleado.capadenegocio.transferencia;

import java.io.Serializable;

import empleado.capadenegocio.reglas.EmpleadoVista;

/**
 * Codifica la informaci�n de un empleado que se va a mostrar en la lista
 * (nombre, apellidos e id), sin incluir informaci�n espec�fica.
 */
public class TransferEmpleadoVista implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private EmpleadoVista empleado;
	
	TransferEmpleadoVista(EmpleadoVista empleado) {
		this.empleado = empleado;
	}

	public void setEmpleadoVista(EmpleadoVista empleado) {
		this.empleado = empleado;
	}

	public EmpleadoVista getEmpleadoVista() {
		return empleado;
	}
}
