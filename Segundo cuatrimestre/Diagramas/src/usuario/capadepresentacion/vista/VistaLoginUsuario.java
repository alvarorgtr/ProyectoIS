package usuario.capadepresentacion.vista;

import empleado.capadepresentacion.vista.VistaGenerica;

public class VistaLoginUsuario implements VistaGenerica {

	VistaLoginUsuarioListener listener;

	public void inicioSesion() {
		listener.inicioSesion();
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
