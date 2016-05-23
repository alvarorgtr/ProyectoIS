package usuario.capadepresentacion.vista;

import empleado.capadepresentacion.vista.VistaGenerica;

public class VistaLoginUsuario implements VistaGenerica {

	private VistaLoginUsuarioListener listener;
	String nombre;
	String contrasenia;
	
	public VistaLoginUsuario(VistaLoginUsuarioListener listener){
		this.listener = listener;
    }
	
	public void inicioSesion() {
		listener.inicioSesion();
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getContrasenia() {
		return contrasenia;
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
