package empleado.capadepresentacion.vista.gestoreventos;

import empleado.capadenegocio.reglas.Contrato;
import empleado.capadenegocio.reglas.Empleado;

public interface VistaCambioContratosListener {
	public void contratoCambiado(Empleado empleado, Contrato nuevoContrato);	
}
