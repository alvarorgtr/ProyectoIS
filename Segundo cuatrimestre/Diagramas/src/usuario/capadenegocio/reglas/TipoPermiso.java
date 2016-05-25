package usuario.capadenegocio.reglas;

public enum TipoPermiso {
	SUPERUSUARIO, ADMINISTRADOR_RECTORADO, ADMINISTRADOR_FACULTAD, SECRETARIO_PAS, SECRETARIO_PDI;
	
	public static TipoPermiso permisoSuperior(TipoPermiso actual) {
		return null;
	}
}
