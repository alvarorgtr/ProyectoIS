package empleado.capadenegocio.logica;

import empleado.capadeintegracion.DAOEmpleadosImp;
import empleado.capadenegocio.transferencia.TransferBusqueda;
import empleado.capadenegocio.transferencia.TransferEmpleado;
import empleado.capadenegocio.transferencia.TransferInt;
import empleado.capadenegocio.transferencia.TransferListEmpleados;

public class ImplementacionEmpleados implements Empleados {

	@Override
	public void añadirEmpleado(TransferEmpleado transfer) {
		DAOEmpleadosImp DAONegocio = DAOEmpleadosImp.getInstance();
		DAONegocio.insertarEmpleado(transfer);
	}

	@Override
	public TransferEmpleado perfilCompletoEmpleado(TransferInt transfer) {
		DAOEmpleadosImp DAONegocio = DAOEmpleadosImp.getInstance();
		TransferEmpleado empleadoTransfer = new TransferEmpleado(DAONegocio.consultarEmpleado(transfer));
		return empleadoTransfer;
	}

	@Override
	public TransferListEmpleados listaEmpleados(TransferInt pagina) {
		DAOEmpleadosImp DAONegocio = DAOEmpleadosImp.getInstance();
		return DAONegocio.getListempleadoVista(pagina);
	}

	@Override
	public void eliminarEmpleado(TransferInt transfer) {
		DAOEmpleadosImp DAONegocio = DAOEmpleadosImp.getInstance();
		DAONegocio.eliminarEmpleado(transfer);
	}
	
	@Override
	public TransferListEmpleados buscarEmpleado(TransferBusqueda transfer) {
		DAOEmpleadosImp DAONegocio = DAOEmpleadosImp.getInstance();
		return DAONegocio.getListEmpleadoPorBusqueda(transfer);
	}

	@Override
	public void modificarEmpleado(TransferEmpleado transfer) {
		DAOEmpleadosImp DAONegocio = DAOEmpleadosImp.getInstance();
		DAONegocio.modificarEmpleado(transfer);
	}
}
