package usuario.capadenegocio.logica;

import usuario.capadeintegracion.DAOUsuariosImp;
import usuario.capadenegocio.reglas.TipoFacultad;
import usuario.capadenegocio.reglas.TipoPermiso;
import usuario.capadenegocio.reglas.Usuario;
import usuario.capadenegocio.transferencia.TransferID;
import usuario.capadenegocio.transferencia.TransferNombre;
import usuario.capadenegocio.transferencia.TransferUsuario;

public class UsuariosImp implements Usuarios {
	private String nombreLogueado;

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
		if (contra.equals(contrasenia)) {
			nombreLogueado = nombre;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean comprobarPermiso(TipoPermiso permisoNecesario, TipoFacultad facultadNecesaria) {

		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		TransferNombre transfer = new TransferNombre(nombreLogueado);
		Usuario usuario = canal.getUsuario(transfer);
		
		return permisoValido(usuario, permisoNecesario, facultadNecesaria);

	}

	private boolean permisoValido(Usuario usuario,
			TipoPermiso permisoNecesario, TipoFacultad facultadNecesaria) {

		/* switch (usuario.getTipoPermiso()) {

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
		return true; */
		
		return true;
	}

	@Override
	public Usuario consultarUsuario(TransferNombre nom) {
		DAOUsuariosImp canal = DAOUsuariosImp.getInstance();
		return canal.getUsuario(nom);
	}

}
