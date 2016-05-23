package usuario.capadepresentacion.controlador;

import usuario.capadepresentacion.vista.VistaActividad;
import usuario.capadepresentacion.vista.VistaActividadListener;
import usuario.capadepresentacion.vista.VistaAniadirUsuario;
import usuario.capadepresentacion.vista.VistaAniadirUsuarioListener;
import usuario.capadepresentacion.vista.VistaEliminarUsuario;
import usuario.capadepresentacion.vista.VistaEliminarUsuarioListener;
import usuario.capadepresentacion.vista.VistaLoginUsuario;
import usuario.capadepresentacion.vista.VistaLoginUsuarioListener;

public interface FactoriaVistasUsuario {
	public VistaActividad vistaActividad(VistaActividadListener listener);
	public VistaAniadirUsuario vistaAniadirUsuario(VistaAniadirUsuarioListener listener);
	public VistaEliminarUsuario vistaEliminarUsuario(VistaEliminarUsuarioListener listener);
	public VistaLoginUsuario vistaLoginUsuario(VistaLoginUsuarioListener listener);
}
