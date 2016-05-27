package usuario.capadenegocio.transferencia;

import usuario.capadenegocio.reglas.TipoPermiso;

public class TransferPermiso {
	private TipoPermiso permiso;
	
	public TransferPermiso(TipoPermiso permiso) {
		this.permiso = permiso;
	}
	
	public TipoPermiso getPermiso() {
		return permiso;
	}
}
