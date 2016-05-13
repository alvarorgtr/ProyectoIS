
package empleado.transferobjects;

import java.io.Serializable;
import java.util.List;

/**
 * Codifica la información de 20 empleados en una lista,
 * respetando el orden. Vamos a pedir los empleados de 20
 * en 20 a la capa de integración. El índice recoge cuál de 
 * esas "hornadas" de empleados estamos pidiendo.
 */
public class TransferListEmpleados implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<TransferEmpleadoVista> listaEmpleados;
	private int index;
	
	public TransferListEmpleados (int index) {
		
	}
	
	public void addTransferEmpleadoVista(TransferEmpleadoVista empleado) {
		
	}
}
