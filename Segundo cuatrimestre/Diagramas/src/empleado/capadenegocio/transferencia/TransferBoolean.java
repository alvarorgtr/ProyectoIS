package empleado.capadenegocio.transferencia;

import java.io.Serializable;

public class TransferBoolean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private boolean bool;
	
	public TransferBoolean (boolean bool) {
		this.bool = bool;
	}
	
	public boolean getBool() {
		return bool;
	}
}
