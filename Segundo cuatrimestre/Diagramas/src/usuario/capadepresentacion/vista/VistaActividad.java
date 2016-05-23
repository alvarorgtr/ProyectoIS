package usuario.capadepresentacion.vista;

import empleado.capadepresentacion.vista.VistaGenerica;

public class VistaActividad implements VistaGenerica{

	VistaActividadListener listener;
	
	public enum types{
		AniadirUsuario, EliminarUsuario, AccesoEmpleados, Logout;
	};
	
	public VistaActividad (VistaActividadListener listener){
		this.listener = listener;
	}
	
	public void eligeOpcion(types op){
		switch(op){
		case AniadirUsuario:
			listener.vistaAniadirUsuario();
			break;
		case EliminarUsuario:
			listener.vistaEliminarUsuario();
			break;
		case AccesoEmpleados:
			listener.vistaAccesoEmpleados();
			break;
		default: //Logout
			listener.logout();
		break;
		}
		
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
