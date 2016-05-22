package empleado.capadenegocio.transferencia;

import java.io.Serializable;

import usuario.capadenegocio.reglas.TipoFacultad;

/**
 * Codifica la información de un nombre para la búsqueda.
 */
public class TransferBusqueda implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellido1;
	private String apellido2;
	private TipoFacultad facultad;

	public TransferBusqueda(String nombre, String apellido1,
			String apellido2, TipoFacultad facultad) {
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public TipoFacultad getFacultad() {
		return facultad;
	}

}
