package usuario.capadepresentacion.vista;

import empleado.capadepresentacion.vista.VistaGenerica;

public class VistaLoginUsuario implements VistaGenerica {

	private VistaLoginUsuarioListener listener;
	private String nombre;
	private String contrasenia;

	public VistaLoginUsuario (VistaLoginUsuarioListener listener){
		this.listener = listener;
		this.nombre = "";
		this.contrasenia = "";
	}
	
	public void inicioSesion() {
		listener.inicioSesion(this.nombre, this.contrasenia);
	}

	public String getNombre(){
		return this.nombre;
	}
	
	public String getContrasenia(){
		return this.contrasenia;
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
