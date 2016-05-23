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
	
	
	@Override
	public void mostrarVista() {
		// TODO Apéndice de método generado automáticamente
		
	}

	@Override
	public void ocultarVista() {
		// TODO Apéndice de método generado automáticamente
		
	}


	
	
}
