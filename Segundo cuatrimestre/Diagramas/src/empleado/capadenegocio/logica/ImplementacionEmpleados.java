package empleado.capadenegocio.logica;

import usuario.capadenegocio.TipoFacultad;
import empleado.capadeintegracion.DAOEmpleadosImp;
import empleado.capadenegocio.reglas.Contrato;
import empleado.capadenegocio.reglas.TipoBaja;
import empleado.capadenegocio.transferencia.TransferBusqueda;
import empleado.capadenegocio.transferencia.TransferEmpleado;
import empleado.capadenegocio.transferencia.TransferInt;
import empleado.capadenegocio.transferencia.TransferListEmpleados;

public class ImplementacionEmpleados implements Empleados {

	@Override
	public void añadirEmpleado(TransferEmpleado transfer) {
		DAOEmpleadosImp DAONegocio = new DAOEmpleadosImp();
		DAONegocio.insertarEmpleado(transfer);
	}

	@Override
	public TransferEmpleado perfilCompletoEmpleado(TransferInt transfer) {
		DAOEmpleadosImp DAONegocio = new DAOEmpleadosImp();
		return null;
	}

	@Override
	public TransferListEmpleados listaEmpleados(TransferInt pagina) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override
	public void eliminarEmpleado(TransferEmpleado transfer) {
		// TODO Apéndice de método generado automáticamente
		
	}
	
	@Override
	public TransferEmpleado buscarEmpleado(TransferBusqueda transfer) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}
	

	@Override
	public void trasladoFacultad(TransferEmpleado transfer) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void cambiarContrato(TransferEmpleado transfer) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void especificarBaja(TransferEmpleado transfer) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void especificarTraslado(TransferEmpleado transfer) {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void cambioDepartamento(TransferEmpleado transfer) {
		// TODO Apéndice de método generado automáticamente
		
	}
}
