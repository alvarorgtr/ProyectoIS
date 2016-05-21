package empleado.capadepresentacion.vista.gestoreventos;

import empleado.capadenegocio.reglas.EmpleadoPDI;

public interface VistaCambioDepartamentoListener extends BotonRetrocesoListener {
	public void cambioDepartamento(EmpleadoPDI empleado, String departamento);
}
