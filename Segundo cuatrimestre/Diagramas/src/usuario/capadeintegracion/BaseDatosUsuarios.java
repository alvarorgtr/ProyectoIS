package usuario.capadeintegracion;

import java.util.List;

import usuario.capadenegocio.TipoFacultad;
import usuario.capadenegocio.TipoPermiso;
import usuario.capadenegocio.Usuario;
import java.lang.String;


public class BaseDatosUsuarios {

	private boolean conectado;
	private List<Usuario> listaUsuarios;
	
	public boolean getConectado() {
		return conectado;
	}
	
	public boolean usuarioYaExiste(String nombre, String contraseña) {
		return false;
	}

	public boolean comprobarPermiso(String nombre, String contraseña, TipoPermiso permisoNecesitado){
		return true;
	}
	
	public boolean añadirUsuario(String nombre, String contraseña){
		return false;
	}
	
	public boolean completarInfo(TipoPermiso permiso, TipoFacultad facultad){
		return false;
	}
	
	public boolean eliminarUsuario(String nombre, String contraseña){
		return false;
	}
}
