package usuario.capadenegocio.logica;

import usuario.capadenegocio.transferencia.TransferBoolean;
import usuario.capadenegocio.transferencia.TransferContrasenia;
import usuario.capadenegocio.transferencia.TransferFacultad;
import usuario.capadenegocio.transferencia.TransferID;
import usuario.capadenegocio.transferencia.TransferNombre;
import usuario.capadenegocio.transferencia.TransferPermiso;
import usuario.capadenegocio.transferencia.TransferUsuario;
import empleado.capadenegocio.transferencia.TransferPermisos;

public interface Usuarios {
	
	public void aniadirUsuario(TransferUsuario us);
	
	public void eliminarUsuario(TransferNombre nom);
		
	public void log(TransferID us);
	
	public TransferBoolean userYaExiste(TransferNombre nombre);
	
	public TransferBoolean comprobarContrasenia(TransferNombre nombre, TransferContrasenia contra);
	
	public TransferBoolean comprobarPermiso(TransferPermiso permisoNecesario, TransferFacultad facultad);
	
	public TransferBoolean validarDatos();
	
	public TransferBoolean datosRellenos();
	
	public TransferBoolean conexionBaseDatos();
	
	public TransferPermisos permisoUsuarioActual();
	
	public TransferUsuario consultarUsuario(TransferNombre nom);

}
