package usuario.capadenegocio.reglas;

public class Memento {
	Usuario usuario;

	public Memento(Usuario u) {
		usuario = u;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	
}