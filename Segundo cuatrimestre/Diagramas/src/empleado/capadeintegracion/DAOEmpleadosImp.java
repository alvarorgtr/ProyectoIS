package empleado.capadeintegracion;

import empleado.capadenegocio.Empleado;
import empleado.transferobjects.TransferEmpleado;
import empleado.transferobjects.TransferId;
import empleado.transferobjects.TransferListEmpleados;
import empleado.transferobjects.TransferBusqueda;


public class DAOEmpleadosImp implements DAOEmpleados {

	@Override
	public Empleado consultarEmpleado(TransferId idEmpleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarEmpleado(TransferId idEmpleado) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TransferListEmpleados getListempleadoVista(int indice) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TransferListEmpleados getListEmpleadoPorBusqueda(
			TransferBusqueda empleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertarEmpleado(TransferEmpleado empleado) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modificarUsuario(TransferEmpleado empleado) {
		// TODO Auto-generated method stub
		return false;
	}

	
}