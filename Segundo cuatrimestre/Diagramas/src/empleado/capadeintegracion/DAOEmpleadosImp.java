package empleado.capadeintegracion;

import empleado.capadenegocio.reglas.Empleado;
import empleado.capadenegocio.transferencia.TransferBusqueda;
import empleado.capadenegocio.transferencia.TransferEmpleado;
import empleado.capadenegocio.transferencia.TransferInt;
import empleado.capadenegocio.transferencia.TransferListEmpleados;


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
	public TransferListEmpleados getListempleadoVista(TransferInt indice) {
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
	public boolean modificarEmpleado(TransferEmpleado empleado) {
		// TODO Auto-generated method stub
		return false;
	}

	
}