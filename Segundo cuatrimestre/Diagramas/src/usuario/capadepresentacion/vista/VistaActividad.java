package usuario.capadepresentacion.vista;


import empleado.capadepresentacion.vista.VistaGenerica;

public class VistaActividad implements VistaGenerica{

	VistaActividadListener listener;
	
	enum types{
		AniadirUsuario, EliminarUsuario,AccesoEmpleados;
	};
	
	public void eligeOpcion(){
		types op = listener.eligeOpcion();
		switch(op){
		case AniadirUsuario:
			listener.aniadirUsuario();
			break;
		case EliminarUsuario:
			listener.eliminarUsuario();
			break;
		case AccesoEmpleados:
			listener.accesoEmpleados();
			break;
		}
		
		
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
