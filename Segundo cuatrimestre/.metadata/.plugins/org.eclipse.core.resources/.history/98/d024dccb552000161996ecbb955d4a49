package usuario.capadepresentacion.vista;

import usuario.capadenegocio.reglas.Usuario;
import empleado.capadenegocio.reglas.Empleado;
import empleado.capadepresentacion.vista.VistaGenerica;

public class VistaAniadirUsuario implements VistaGenerica {

	VistaAniadirUsuarioListener listener;
	
	public VistaAniadirUsuario (VistaAniadirUsuarioListener listener){
		this.listener = listener;
	}
	
	public void aniadirUsuario(){
		listener.añadir();
	}
	
	protected Usuario infoNuevoUser(){
		
	}

	public void aniadirEmpleadoPulsado(){
		listener.empleadoAniadido(informacionNuevoEmpleado());
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
