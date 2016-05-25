package empleado.capadenegocio.logica;

import usuario.capadenegocio.logica.UsuariosImp;
import usuario.capadenegocio.reglas.TipoPermiso;
import empleado.capadeintegracion.DAOEmpleadosImp;
import empleado.capadenegocio.transferencia.TransferBusqueda;
import empleado.capadenegocio.transferencia.TransferEmpleado;
import empleado.capadenegocio.transferencia.TransferInt;
import empleado.capadenegocio.transferencia.TransferListEmpleados;

public class ImplementacionEmpleados implements Empleados {
	private UsuariosImp servicioAplicacionUsuarios;

	public ImplementacionEmpleados(UsuariosImp servicioAplicacionUsuarios) {
		this.servicioAplicacionUsuarios = servicioAplicacionUsuarios;
	}

	// SUPERUSUARIO, ADMINISTRADOR_RECTORADO, ADMINISTRADOR_FACULTAD,
	// SECRETARIO_PAS, SECRETARIO_PDI
	@Override
	public void aniadirEmpleado(TransferEmpleado transfer) {
		TipoPermiso necesario = transfer.getEmpleado().isPAS() ? TipoPermiso.SECRETARIO_PAS
				: TipoPermiso.SECRETARIO_PDI;
		if (servicioAplicacionUsuarios.comprobarPermiso(necesario, transfer
				.getEmpleado().getFacultad())) {
			DAOEmpleadosImp DAONegocio = DAOEmpleadosImp.getInstance();
			DAONegocio.insertarEmpleado(transfer);
		} else {
			// Error
		}
	}

	@Override
	public TransferEmpleado perfilCompletoEmpleado(TransferInt transfer) {
		DAOEmpleadosImp DAONegocio = DAOEmpleadosImp.getInstance();
		TransferEmpleado empleadoTransfer = new TransferEmpleado(
				DAONegocio.consultarEmpleado(transfer));
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
