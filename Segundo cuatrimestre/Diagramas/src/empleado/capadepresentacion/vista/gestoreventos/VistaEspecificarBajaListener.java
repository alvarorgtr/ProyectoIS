package empleado.capadepresentacion.vista.gestoreventos;

import empleado.capadenegocio.reglas.TipoBaja;

public interface VistaEspecificarBajaListener {
	public void darDeBaja(int idEmpleado, TipoBaja baja);
	public void cancelarBaja(int idEmpleado);
}
