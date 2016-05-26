package usuario.capadenegocio.transferencia;

import usuario.capadenegocio.reglas.TipoFacultad;

public class TransferFacultad {
	private TipoFacultad facultad;

	public TransferFacultad(TipoFacultad facultad) {
		this.facultad = facultad;
	}

	public TipoFacultad getFacultad() {
		return facultad;
	}
}
