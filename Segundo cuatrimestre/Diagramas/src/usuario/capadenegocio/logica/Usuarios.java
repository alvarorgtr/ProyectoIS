package usuario.capadenegocio.logica;

import usuario.capadenegocio.reglas.TipoPermiso;
import usuario.capadenegocio.transferencia.TransferID;
import usuario.capadenegocio.transferencia.TransferUsuario;

public interface Usuarios {
	
	public void aniadirUsuario(TransferUsuario us);
	
	public void eliminarUsuario(TransferID us);
	
	public boolean log(TransferID us);
	
	public boolean userYaExiste(String nombre);
	
	public boolean comprobarContrasenia(String nombre, String contra);
	
	public boolean comprobarPermiso(String nombre, TipoPermiso permisoNecesario);

}
