package empleado.capadeintegracion;

import empleado.capadenegocio.reglas.Empleado;
import empleado.capadenegocio.transferencia.TransferBusqueda;
import empleado.capadenegocio.transferencia.TransferEmpleado;
import empleado.capadenegocio.transferencia.TransferInt;
import empleado.capadenegocio.transferencia.TransferListEmpleados;


public class DAOEmpleadosImp implements DAOEmpleados {

	@Override
	public Empleado consultarEmpleado(TransferInt idEmpleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminarEmpleado(TransferInt idEmpleado) {
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