package empleado.capadenegocio.logica;

import usuario.capadenegocio.logica.UsuariosImp;
import usuario.capadenegocio.reglas.TipoPermiso;
import usuario.capadenegocio.transferencia.TransferFacultad;
import usuario.capadenegocio.transferencia.TransferPermiso;
import empleado.capadeintegracion.DAOEmpleadosImp;
import empleado.capadenegocio.transferencia.TransferBusqueda;
import empleado.capadenegocio.transferencia.TransferEmpleado;
import empleado.capadenegocio.transferencia.TransferInt;
import empleado.capadenegocio.transferencia.TransferListEmpleados;
import empleado.capadenegocio.transferencia.TransferPermisos;

public class ImplementacionEmpleados implements Empleados {
	private UsuariosImp servicioAplicacionUsuarios;

	public ImplementacionEmpleados(UsuariosImp servicioAplicacionUsuarios) {
		this.servicioAplicacionUsuarios = servicioAplicacionUsuarios;
	}

	// SUPERUSUARIO, ADMINISTRADOR_RECTORADO, ADMINISTRADOR_FACULTAD,
	// SECRETARIO_PAS, SECRETARIO_PDI
	@Override
	public void aniadirEmpleado(TransferEmpleado transfer) {
		if (servicioAplicacionUsuarios.validarDatos().getBool()
				&& servicioAplicacionUsuarios.datosRellenos().getBool()) {
			TipoPermiso necesario = transfer.getEmpleado().isPAS() ? TipoPermiso.SECRETARIO_PAS
					: TipoPermiso.SECRETARIO_PDI;
			TransferPermiso perm = new TransferPermiso(necesario);
			TransferFacultad fac = new TransferFacultad(transfer.getEmpleado().getFacultad());
			boolean permiso = servicioAplicacionUsuarios.comprobarPermiso(perm, fac).getBool();
			if (permiso && servicioAplicacionUsuarios.conexionBaseDatos().getBool()) {
				DAOEmpleadosImp DAONegocio = DAOEmpleadosImp.getInstance();
				DAONegocio.insertarEmpleado(transfer);
			} else {
				// Error
			}
		}
	}

	@Override
	public TransferEmpleado perfilCompletoEmpleado(TransferInt transfer) {
		DAOEmpleadosImp DAONegocio = DAOEmpleadosImp.getInstance();
		TransferEmpleado empleadoTransfer = DAONegocio.consultarEmpleado(transfer);
		TipoPermiso necesario = empleadoTransfer.getEmpleado().isPAS() ? TipoPermiso.SECRETARIO_PAS
				: TipoPermiso.SECRETARIO_PDI;
		TransferPermiso perm = new TransferPermiso(necesario);
		TransferFacultad fac = new TransferFacultad(empleadoTransfer.getEmpleado().getFacultad());
		boolean permiso = servicioAplicacionUsuarios.comprobarPermiso(perm, fac).getBool();
		if (permiso) {
			return empleadoTransfer;
		} else {
			// Error
			return null;
		}
	}

	@Override
	public TransferListEmpleados listaEmpleados(TransferInt pagina) {
		DAOEmpleadosImp DAONegocio = DAOEmpleadosImp.getInstance();
		TransferPermisos transfer = servicioAplicacionUsuarios
				.permisoUsuarioActual();
		return DAONegocio.getListEmpleadoVista(pagina, transfer);
	}

	@Override
	public void eliminarEmpleado(TransferInt transfer) {
		DAOEmpleadosImp DAONegocio = DAOEmpleadosImp.getInstance();
		DAONegocio.eliminarEmpleado(transfer);
	}

	@Override
	public TransferListEmpleados buscarEmpleado(TransferBusqueda transfer) {
		if (servicioAplicacionUsuarios.validarDatos().getBool()
				&& servicioAplicacionUsuarios.conexionBaseDatos().getBool()) {
			DAOEmpleadosImp DAONegocio = DAOEmpleadosImp.getInstance();
			return DAONegocio.getListEmpleadoPorBusqueda(transfer);
		} else return null;
	}

	@Override
	public void modificarEmpleado(TransferEmpleado transfer) {
		TipoPermiso necesario = transfer.getEmpleado().isPAS() ? TipoPermiso.SECRETARIO_PAS
				: TipoPermiso.SECRETARIO_PDI;
		TransferPermiso perm = new TransferPermiso(necesario);
		TransferFacultad fac = new TransferFacultad(transfer.getEmpleado().getFacultad());
		boolean permiso = servicioAplicacionUsuarios.comprobarPermiso(perm, fac).getBool();
		if (permiso) {
			DAOEmpleadosImp DAONegocio = DAOEmpleadosImp.getInstance();
			DAONegocio.modificarEmpleado(transfer);
		} else {
			// Error
		}
	}
}
