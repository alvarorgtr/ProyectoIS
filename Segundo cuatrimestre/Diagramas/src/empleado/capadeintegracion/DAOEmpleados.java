package empleado.capadeintegracion;

import empleado.capadenegocio.reglas.Empleado;
import empleado.capadenegocio.transferencia.TransferBusqueda;
import empleado.capadenegocio.transferencia.TransferEmpleado;
import empleado.capadenegocio.transferencia.TransferInt;
import empleado.capadenegocio.transferencia.TransferListEmpleados;

public interface DAOEmpleados {

	public Empleado consultarEmpleado(TransferInt idEmpleado);

	public boolean eliminarEmpleado(TransferInt idEmpleado);

	public TransferListEmpleados getListempleadoVista(int indice);
	
	public TransferListEmpleados getListEmpleadoPorBusqueda(TransferBusqueda empleado);
	
	public boolean insertarEmpleado (TransferEmpleado empleado);
	
	public boolean modificarUsuario (TransferEmpleado empleado);

}
