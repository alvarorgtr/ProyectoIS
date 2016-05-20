package empleado.capadenegocio.transferencia;

import usuario.capadenegocio.TipoFacultad;

public class TransferBusquedaPDI extends TransferBusqueda {
	private static final long serialVersionUID = 1L;
	
	private String departamento;
	private String despacho;
	
	public TransferBusquedaPDI(String nombre, String apellido1,
			String apellido2, String departamento, String despacho,
			TipoFacultad facultad) {
		super(nombre, apellido1, apellido2, facultad);
		
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public String getDespacho() {
		return despacho;
	}
	
}
