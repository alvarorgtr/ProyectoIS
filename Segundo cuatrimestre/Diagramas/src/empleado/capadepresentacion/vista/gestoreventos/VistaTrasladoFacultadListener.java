package empleado.capadepresentacion.vista.gestoreventos;

import usuario.capadenegocio.reglas.TipoFacultad;
import empleado.capadenegocio.reglas.Empleado;

public interface VistaTrasladoFacultadListener extends BotonRetrocesoListener {
	public void trasladoFacultad(Empleado empleado, TipoFacultad facultad);
}
