package empleado.capadeintegracion;

import empleado.capadenegocio.transferencia.TransferBusqueda;
import empleado.capadenegocio.transferencia.TransferEmpleado;
import empleado.capadenegocio.transferencia.TransferInt;
import empleado.capadenegocio.transferencia.TransferListEmpleados;
import empleado.capadenegocio.transferencia.TransferPermisos;

public interface DAOEmpleados {

	public TransferEmpleado consultarEmpleado(TransferInt idEmpleado);

	public void eliminarEmpleado(TransferInt idEmpleado);

	public TransferListEmpleados getListEmpleadoVista(TransferInt indice, TransferPermisos permisos);
	
	public TransferListEmpleados getListEmpleadoPorBusqueda(TransferBusqueda empleado);
	
	public void insertarEmpleado (TransferEmpleado empleado);
	
	public void modificarEmpleado (TransferEmpleado empleado);

}
