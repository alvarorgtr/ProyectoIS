package empleado.capadeintegracion;

import empleado.capadenegocio.reglas.Empleado;
import empleado.transferobjects.TransferEmpleado;
import empleado.transferobjects.TransferId;
import empleado.transferobjects.TransferListEmpleados;
import empleado.transferobjects.TransferBusqueda;

public interface DAOEmpleados {

	public Empleado consultarEmpleado(TransferInt idEmpleado);

	public boolean eliminarEmpleado(TransferInt idEmpleado);

	public TransferListEmpleados getListempleadoVista(int indice);
	
	public TransferListEmpleados getListEmpleadoPorBusqueda(TransferBusqueda empleado);
	
	public boolean insertarEmpleado (TransferEmpleado empleado);
	
	public boolean modificarUsuario (TransferEmpleado empleado);

}
