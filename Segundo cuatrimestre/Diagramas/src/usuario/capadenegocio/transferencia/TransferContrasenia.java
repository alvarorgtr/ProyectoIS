package usuario.capadenegocio.transferencia;

import java.io.Serializable;

public class TransferContrasenia implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String contrasenia;
	
	public TransferContrasenia(String contrasenia){
		this.contrasenia = contrasenia;
	}
	
	public String getContrasenia(){
		return contrasenia;
	}
	
}
