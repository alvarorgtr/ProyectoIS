package empleado.capadeintegracion;

import empleado.capadenegocio.transferencia.TransferBusqueda;
import empleado.capadenegocio.transferencia.TransferEmpleado;
import empleado.capadenegocio.transferencia.TransferInt;
import empleado.capadenegocio.transferencia.TransferListEmpleados;
import empleado.capadenegocio.transferencia.TransferPermisos;


public class DAOEmpleadosImp implements DAOEmpleados {
	
	private static DAOEmpleadosImp instance;
	
	private DAOEmpleadosImp(){}
	
	public static DAOEmpleadosImp getInstance(){
		if(instance == null){
			instance = new DAOEmpleadosImp(); 
		}
		return instance;
	}

	@Override
	public TransferEmpleado consultarEmpleado(TransferInt idEmpleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarEmpleado(TransferInt idEmpleado) {
		// TODO Auto-generated method stub
	}

	@Override
	public TransferListEmpleados getListEmpleadoVista(TransferInt indice, TransferPermisos permiso) {
		return null;
	}

	@Override
	public TransferListEmpleados getListEmpleadoPorBusqueda(
			TransferBusqueda empleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertarEmpleado(TransferEmpleado empleado) {
		// TODO Auto-generated method stub
	}

	@Override
	public void modificarEmpleado(TransferEmpleado empleado) {
		// TODO Auto-generated method stub
	}

	
}