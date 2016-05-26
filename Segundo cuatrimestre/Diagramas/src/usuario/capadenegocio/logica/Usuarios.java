package usuario.capadenegocio.logica;

import usuario.capadenegocio.reglas.TipoFacultad;
import usuario.capadenegocio.reglas.TipoPermiso;
import usuario.capadenegocio.reglas.Usuario;
import usuario.capadenegocio.transferencia.TransferID;
import usuario.capadenegocio.transferencia.TransferNombre;
import usuario.capadenegocio.transferencia.TransferUsuario;
import empleado.capadenegocio.transferencia.TransferPermisos;

public interface Usuarios {
	
	public void aniadirUsuario(TransferUsuario us);
	
	public void eliminarUsuario(TransferNombre nom);
		
	public void log(TransferID us);
	
	public boolean userYaExiste(String nombre);
	
	public boolean comprobarContrasenia(String nombre, String contra);
	
	public boolean comprobarPermiso(TipoPermiso permisoNecesario, TipoFacultad facultad);
	
	public boolean validarDatos();
	
	public boolean datosRellenos();
	
	public boolean conexionBaseDatos();
	
	public TransferPermisos permisoUsuarioActual();
	
	public Usuario consultarUsuario(TransferNombre nom);

}
