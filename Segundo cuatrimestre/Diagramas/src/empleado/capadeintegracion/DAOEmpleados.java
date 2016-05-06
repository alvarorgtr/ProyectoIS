package empleado.capadeintegracion;

import empleado.capadenegocio.Empleado;
import empleado.transferobjects.TransferEmpleado;
import empleado.transferobjects.TransferId;
import empleado.transferobjects.TransferListEmpleados;
import empleado.transferobjects.TransferNombre;

public interface DAOEmpleados {

	public Empleado consultarEmpleado(TransferId idEmpleado);

	public boolean eliminarEmpleado(TransferId idEmpleado);

	public TransferListEmpleados getListempleadoVista(int indice);
	
	public TransferListEmpleados getListEmpleadoPorBusqueda(TransferNombre nombre);
	
	public boolean insertarEmpleado (TransferEmpleado empleado);
	
	public boolean modificarUsuario (TransferEmpleado empleado);

}
