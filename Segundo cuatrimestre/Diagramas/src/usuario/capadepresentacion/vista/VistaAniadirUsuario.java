package usuario.capadepresentacion.vista;

import usuario.capadenegocio.reglas.Usuario;
import empleado.capadepresentacion.vista.VistaGenerica;

public class VistaAniadirUsuario implements VistaGenerica {

	VistaAniadirUsuarioListener listener;
	
	public VistaAniadirUsuario (VistaAniadirUsuarioListener listener){
		this.listener = listener;
	}
	
	protected Usuario infoNuevoUser(){
		return null;
	}
	
	public void aniadirUsuario(){
		listener.aniadir(infoNuevoUser());
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
