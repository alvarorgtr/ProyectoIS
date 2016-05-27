package usuario.capadeintegracion;

import usuario.capadenegocio.transferencia.TransferBoolean;
import usuario.capadenegocio.transferencia.TransferContrasenia;
import usuario.capadenegocio.transferencia.TransferID;
import usuario.capadenegocio.transferencia.TransferNombre;
import usuario.capadenegocio.transferencia.TransferPermiso;
import usuario.capadenegocio.transferencia.TransferUsuario;

public interface DAOUsuarios {
	
	public void loging(TransferID usuario);
	
	public void aniadirUsuario(TransferUsuario usuario);
	
	public void eliminarUsuario(TransferNombre usuario);
		
	public TransferBoolean yaExiste(TransferNombre nom);
	
	public TransferContrasenia getContra(TransferNombre nom);
	
	public TransferPermiso comprobarPerm(TransferNombre nombre);
	
	public TransferUsuario getUsuario(TransferNombre nom);
	
}
