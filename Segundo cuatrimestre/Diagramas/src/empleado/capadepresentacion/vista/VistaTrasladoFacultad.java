package empleado.capadepresentacion.vista;

import usuario.capadenegocio.reglas.TipoFacultad;
import empleado.capadenegocio.reglas.Empleado;
import empleado.capadepresentacion.vista.gestoreventos.VistaTrasladoFacultadListener;

public abstract class VistaTrasladoFacultad implements VistaGenerica {
	private VistaTrasladoFacultadListener listener;
	private Empleado empleado;
	
	public VistaTrasladoFacultad(VistaTrasladoFacultadListener listener) {
		this.listener = listener;
	}
	
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
		actualizarInformacion();
	}

	@Override
	public void mostrarVista() {

	}

	@Override
	public void ocultarVista() {

	}
	
	protected abstract TipoFacultad tipoFacultadBaja();

	public void trasladoFacultad() {
		listener.trasladoFacultad(empleado, tipoFacultadBaja());
	}
	
	protected abstract void actualizarInformacion();
}
