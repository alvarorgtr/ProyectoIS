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
	
	public static TransferId instanceTransferId;
	
	private int id;
	
	private TransferId (int id) {
		instanceTransferId.id = id;
	}
	
	public static TransferId getInstance(int id){
		if(instanceTransferId == null){
			instanceTransferId = new TransferId(id);
		}
		else{
			instanceTransferId.id = id;
		}
		return instanceTransferId;
	}
}
