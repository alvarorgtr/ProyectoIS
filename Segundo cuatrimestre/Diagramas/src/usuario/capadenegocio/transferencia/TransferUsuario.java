package usuario.capadenegocio.transferencia;

import java.io.Serializable;

import usuario.capadenegocio.reglas.Usuario;

/**
 * Clase que codifica la información de un usuario al completo
 * @author usuario
 *
 */
public class TransferUsuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuario user;
	
	public TransferUsuario(Usuario us){
		this.user = us;
	}

	public Usuario getUser() {
		return this.user;
	}

}
