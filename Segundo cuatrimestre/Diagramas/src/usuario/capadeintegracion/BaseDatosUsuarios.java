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
	
	public boolean usuarioYaExiste(String nombre, String contrase�a) {
		return false;
	}

	public boolean comprobarPermiso(String nombre, String contrase�a, TipoPermiso permisoNecesitado){
		return true;
	}
	
	public boolean a�adirUsuario(String nombre, String contrase�a){
		return false;
	}
	
	public boolean completarInfo(TipoPermiso permiso, TipoFacultad facultad){
		return false;
	}
	
	public boolean eliminarUsuario(String nombre, String contrase�a){
		return false;
	}
}
