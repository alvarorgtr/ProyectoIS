package usuario.capadepresentacion.vista;

import empleado.capadepresentacion.vista.VistaGenerica;

public class VistaEliminarUsuario implements VistaGenerica{

	VistaEliminarUsuarioListener listener;
	//Conserje cons;
	
	public VistaEliminarUsuario(VistaEliminarUsuarioListener listener){
		this.listener = listener;
	}
	
	public void eliminar(){
	//	cons.setMemento(new Memento(u));
		listener.eliminar();		
	}
	
	public void descartar(){
		//listener.descartar(cons.getMemento());
		listener.descartar();
	}
	
	@Override
	public void mostrarVista() {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void ocultarVista() {
		// TODO Apéndice de método generado automáticamente
		
	}

	
	
}
