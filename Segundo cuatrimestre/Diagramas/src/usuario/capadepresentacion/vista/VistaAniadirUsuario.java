package usuario.capadepresentacion.vista;

import empleado.capadepresentacion.vista.VistaGenerica;

public class VistaAniadirUsuario implements VistaGenerica {

	VistaAniadirUsuarioListener listener;
	
	public VistaAniadirUsuario (VistaAniadirUsuarioListener listener){
		this.listener = listener;
	}
	
	public void aniadirUsuario(){
		listener.a�adir();
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
