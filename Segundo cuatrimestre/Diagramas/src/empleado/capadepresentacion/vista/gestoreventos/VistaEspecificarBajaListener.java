package empleado.capadepresentacion.vista.gestoreventos;

import empleado.capadenegocio.reglas.Empleado;
import empleado.capadenegocio.reglas.TipoBaja;

public interface VistaEspecificarBajaListener extends BotonRetrocesoListener {
	public void darDeBaja(Empleado nuevoEmpleado, TipoBaja baja);
	public void cancelarBaja(Empleado nuevoEmpleado);
}
