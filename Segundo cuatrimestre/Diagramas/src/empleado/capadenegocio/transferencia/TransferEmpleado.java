package empleado.capadenegocio.transferencia;

import java.io.Serializable;

import empleado.capadenegocio.reglas.Empleado;

/**
 * Codifica la información de un empleado al completo.
 */
public class TransferEmpleado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Empleado empleado;
	
	public TransferEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	public Empleado getEmpleado(){
		return this.empleado;
	}
}
