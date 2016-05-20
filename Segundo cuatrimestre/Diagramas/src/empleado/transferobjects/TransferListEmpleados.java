
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
	
	private static TransferListEmpleados instanceTransferListEmpleados;
	
	private List<TransferEmpleadoVista> listaEmpleados;
	private int index;
	
	private TransferListEmpleados (int index) {
		this.index = index;
	}
	
	public static synchronized TransferListEmpleados getInstance(int index){
		if(instanceTransferListEmpleados == null){
			instanceTransferListEmpleados = new TransferListEmpleados(index);
		}
		else{
			instanceTransferListEmpleados.index = index;
		}
		return instanceTransferListEmpleados;
	}
	
	public void addTransferEmpleadoVista(TransferEmpleadoVista empleado) {
		
	}
	
	public List<TransferEmpleadoVista> getList(){
		return listaEmpleados;
	}
}
