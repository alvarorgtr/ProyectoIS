package usuario.capadeintegracion;

import usuario.capadenegocio.reglas.TipoPermiso;
import usuario.capadenegocio.reglas.Usuario;
import usuario.capadenegocio.transferencia.TransferID;
import usuario.capadenegocio.transferencia.TransferNombre;
import usuario.capadenegocio.transferencia.TransferUsuario;

public interface DAOUsuarios {
	
	public void loging(TransferID usuario);
	
	public boolean aniadirUsuario(TransferUsuario usuario);
	
	public boolean eliminarUsuario(TransferNombre usuario);
		
	public boolean yaExiste(TransferNombre nom);
	
	public String getContra(TransferNombre nom);
	
	public TipoPermiso comprobarPerm(TransferNombre nombre);
	
	public Usuario getUsuario(TransferNombre nom);
	
}
