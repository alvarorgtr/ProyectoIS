package empleado.capadenegocio.transferencia;

import empleado.capadenegocio.reglas.AreaTrabajo;
import usuario.capadenegocio.TipoFacultad;

public class TransferBusquedaPAS extends TransferBusqueda {
	private static final long serialVersionUID = 1L;

	private AreaTrabajo areaTrabajo;

	public TransferBusquedaPAS(String nombre, String apellido1,
			String apellido2, TipoFacultad facultad, AreaTrabajo areaTrabajo) {
		super(nombre, apellido1, apellido2, facultad);
	}
	
	public AreaTrabajo getAreaTrabajo() {
		return areaTrabajo;
	}

}
