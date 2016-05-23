package usuario.capadeintegracion;

import usuario.capadenegocio.reglas.TipoPermiso;
import usuario.capadenegocio.reglas.Usuario;
import usuario.capadenegocio.transferencia.TransferID;
import usuario.capadenegocio.transferencia.TransferNombre;
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
		// TODO Ap�ndice de m�todo generado autom�ticamente
 	}
	
	@Override
	public boolean aniadirUsuario(TransferUsuario usuario) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	public boolean eliminarUsuario(TransferNombre usuario) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	public String getContra(TransferNombre nom) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override
	public TipoPermiso comprobarPerm(TransferNombre nombre) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	@Override
	public boolean yaExiste(TransferNombre nom) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return false;
	}

	@Override
	public Usuario getUsuario(TransferNombre nom) {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		return null;
	}

	
}
