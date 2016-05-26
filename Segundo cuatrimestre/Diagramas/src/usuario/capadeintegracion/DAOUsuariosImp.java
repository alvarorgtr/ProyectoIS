package usuario.capadeintegracion;

import usuario.capadenegocio.transferencia.TransferBoolean;
import usuario.capadenegocio.transferencia.TransferContrasenia;
import usuario.capadenegocio.transferencia.TransferID;
import usuario.capadenegocio.transferencia.TransferNombre;
import usuario.capadenegocio.transferencia.TransferPermiso;
import usuario.capadenegocio.transferencia.TransferUsuario;

public class DAOUsuariosImp implements DAOUsuarios{
	
	private static DAOUsuariosImp instance;
	
	private DAOUsuariosImp(){}
	
	public static DAOUsuariosImp getInstance(){
		if(instance == null){
			instance = new DAOUsuariosImp(); 
		}
		return instance;
	}
	
	@Override
	public void loging(TransferID usuario) {
		// TODO Apéndice de método generado automáticamente
 	}
	
	@Override
	public void aniadirUsuario(TransferUsuario usuario) {
		// TODO Apéndice de método generado automáticamente
	}

	@Override
	public void eliminarUsuario(TransferNombre usuario) {
		// TODO Apéndice de método generado automáticamente
	}

	@Override
	public TransferContrasenia getContra(TransferNombre nom) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override
	public TransferPermiso comprobarPerm(TransferNombre nombre) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	@Override
	public TransferBoolean yaExiste(TransferNombre nom) {
		// TODO Apéndice de método generado automáticamente
		return new TransferBoolean(false);
	}

	@Override
	public TransferUsuario getUsuario(TransferNombre nom) {
		// TODO Apéndice de método generado automáticamente
		return null;
	}

	
}
