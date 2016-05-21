package empleado.capadepresentacion.vista.gestoreventos;

import empleado.capadenegocio.reglas.Empleado;

public interface VistaAniadirEmpleadoListener extends BotonRetrocesoListener {
	public void empleadoAniadido(Empleado nuevoEmpleado);
}
