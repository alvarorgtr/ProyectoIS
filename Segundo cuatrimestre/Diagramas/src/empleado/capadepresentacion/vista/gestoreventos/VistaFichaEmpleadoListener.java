package empleado.capadepresentacion.vista.gestoreventos;

import empleado.capadenegocio.reglas.Empleado;


public interface VistaFichaEmpleadoListener extends BotonRetrocesoListener {
	public void cambiarContratoPulsado(Empleado empleado);
	public void especificarBajaPulsado(Empleado empleado);
	public void especificarTrasladoPulsado(Empleado empleado);
	public void especificarCambioDepartamentoPulsado(Empleado empleado);
	public void eliminarFichaPulsado(Empleado empleado);
}
