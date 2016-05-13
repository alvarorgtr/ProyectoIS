package usuario.capadepresentacion.vista;

import empleado.capadepresentacion.vista.VistaGenerica;

public class VistaLoginUsuario implements VistaGenerica {

	VistaLoginUsuarioListener listener;

	public void inicioSesion() {
		listener.inicioSesion();
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
