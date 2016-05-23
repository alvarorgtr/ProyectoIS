package usuario.capadenegocio.logica;

import usuario.capadeintegracion.DAOUsuariosImp;
import usuario.capadenegocio.reglas.TipoPermiso;
import usuario.capadenegocio.reglas.Usuario;
import usuario.capadenegocio.transferencia.TransferID;
import usuario.capadenegocio.transferencia.TransferNombre;
import usuario.capadenegocio.transferencia.TransferUsuario;

public class UsuariosImp implements Usuarios {

	@Override
	public void aniadirUsuario(TransferUsuario us) {
		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		canal.aniadirUsuario(us);
	}

	@Override
	public void eliminarUsuario(TransferNombre nombre) {
		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		canal.eliminarUsuario(nombre);
	}

	@Override
	public void log(TransferID us) {
		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		canal.loging(us);
	}

	@Override
	public boolean userYaExiste(String nombre) {
		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		TransferNombre us = new TransferNombre(nombre);
		return canal.yaExiste(us);
	}

	@Override
	public boolean comprobarContrasenia(String nombre, String contra) {
		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		TransferNombre us = new TransferNombre(nombre);
		String contrasenia = canal.getContra(us);
		if (contra.equals(contrasenia))
			return true;
		else
			return false;
	}

	@Override
	public boolean comprobarPermiso(String nombre, TipoPermiso permisoNecesario) {

		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		TransferNombre us = new TransferNombre(nombre);
		TipoPermiso permiso = canal.comprobarPerm(us);

		return permisoValido(permiso, permisoNecesario);

	}

	private boolean permisoValido(TipoPermiso permiso,
			TipoPermiso permisoNecesario) {

		switch (permiso) {

		case SUPERUSUARIO:
			return true;

		case ADMINISTRADOR_RECTORADO: {
			switch (permisoNecesario) {
			case SUPERUSUARIO:
				return false;
			default:
				return true;

			}
		}

		case ADMINISTRADOR_FACULTAD: {
			switch (permisoNecesario) {
			case SUPERUSUARIO:
			case ADMINISTRADOR_RECTORADO:
				return false;
			default:
				return true;
			}

		}

		case SECRETARIO_PAS:
			if (permisoNecesario == TipoPermiso.SECRETARIO_PAS)
				return true;
			return false;

		case SECRETARIO_PDI:
			if (permisoNecesario == TipoPermiso.SECRETARIO_PDI)
				return true;
			return false;

		}
		return true;
	}

	@Override
	public Usuario consultarUsuario(TransferNombre nom) {
		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		return canal.getUsuario(nom);
	}

}
