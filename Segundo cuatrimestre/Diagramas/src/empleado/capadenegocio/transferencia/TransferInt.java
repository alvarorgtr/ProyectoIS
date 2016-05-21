package empleado.capadenegocio.transferencia;

import java.io.Serializable;

/**
 * Objeto de transferencia con varias funcionalidades que solo
 * necesitan un numero entero, a menudo un identificador:
 * - Eliminar empleado
 * - Pedir empleado
 * - Pedir lista empleados (solo necesita la "página" de la lista)
 */
public class TransferInt implements Serializable {
	private static final long serialVersionUID = 1L;
	private int entero;
	
	public TransferInt (int entero) {
		this.entero = entero;
	}

	public int getEntero() {
		return entero;
	}
}
