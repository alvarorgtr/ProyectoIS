
package empleado.capadenegocio.transferencia;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import empleado.capadenegocio.reglas.EmpleadoVista;

/**
 * Codifica la información de 20 empleados en una lista,
 * respetando el orden. Vamos a pedir los empleados de 20
 * en 20 a la capa de integración. El índice recoge cuál de 
 * esas "hornadas" de empleados estamos pidiendo.
 */
public class TransferListEmpleados implements Serializable {
	private static final long serialVersionUID = 1L;
	private List<EmpleadoVista> listaEmpleados;
	private int index;
	
	public TransferListEmpleados (int index) {
		this.index = index;
		this.listaEmpleados = new ArrayList<EmpleadoVista>();
	}
	
	public void addEmpleadoVista(EmpleadoVista empleado) {
		listaEmpleados.add(empleado);
	}
	
	public List<EmpleadoVista> getList(){
		return listaEmpleados;
	}
	
	public int getIndex() {
		return index;
	}
}
