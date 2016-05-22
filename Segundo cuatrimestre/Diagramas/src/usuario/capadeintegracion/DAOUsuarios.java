package usuario.capadeintegracion;

import usuario.capadenegocio.reglas.TipoPermiso;
import usuario.capadenegocio.transferencia.TransferID;
import usuario.capadenegocio.transferencia.TransferNombre;
import usuario.capadenegocio.transferencia.TransferUsuario;

public interface DAOUsuarios {
	
	public boolean logging(TransferID usuario);
	
	public boolean aniadirUsuario(TransferUsuario usuario);
	
	public boolean eliminarUsuario(TransferID usuario);
	
	public boolean yaExiste(TransferNombre nom);
	
	public String comprobarContra(TransferNombre nom);
	
	public TipoPermiso comprobarPerm(TransferNombre nombre);
	
}
