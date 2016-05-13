package empleado.transferobjects;

import java.io.Serializable;

/**
 * Objeto de transferencia con varias funcionalidades que solo
 * necesitan un identificador:
 * - Eliminar empleado
 * - Pedir empleado
 */
public class TransferId implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	
	public TransferId (int id) {
		
	}
}
