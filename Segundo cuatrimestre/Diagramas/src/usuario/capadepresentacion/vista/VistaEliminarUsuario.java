package usuario.capadepresentacion.vista;

import empleado.capadepresentacion.vista.VistaGenerica;

public class VistaEliminarUsuario implements VistaGenerica{

	VistaEliminarUsuarioListener listener;
	
	public VistaEliminarUsuario(VistaEliminarUsuarioListener listener){
		this.listener = listener;
	}
	
	protected String infoUsuarioEliminar(){
		return null;
	}
	
	public void eliminar(){
		listener.eliminar(infoUsuarioEliminar());		
	}
	
	public void descartar(){
		listener.descartar();
	}
	
	@Override
	public void mostrarVista() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	@Override
	public void ocultarVista() {
		// TODO Ap�ndice de m�todo generado autom�ticamente
		
	}

	
	
}
