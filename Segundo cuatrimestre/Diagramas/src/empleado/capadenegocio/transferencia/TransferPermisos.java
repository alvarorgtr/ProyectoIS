package empleado.capadenegocio.transferencia;

import usuario.capadenegocio.reglas.TipoPermiso;

public class TransferPermisos {
	private TipoPermiso permiso;
	
	public TransferPermisos(TipoPermiso permiso) {
		this.permiso = permiso;
	}
	
	public TipoPermiso getPermiso() {
		return this.permiso;
	}
}
