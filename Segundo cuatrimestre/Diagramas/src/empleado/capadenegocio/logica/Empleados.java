package empleado.capadenegocio.logica;

import empleado.capadenegocio.reglas.Contrato;
import empleado.capadenegocio.reglas.Empleado;
import empleado.capadenegocio.transferencia.TransferEmpleado;
import empleado.capadenegocio.transferencia.TransferInt;

public interface Empleados {
	public void añadirEmpleado(TransferEmpleado transfer);
	public void perfilCompletoEmpleado(TransferInt transfer);
	public void listaEmpleados(TransferInt pagina);
	public void eliminarEmpleado(TransferEmpleado transfer);
	
	public void trasladoFacultad(TransferEmpleado transfer);
	public void cambiarContrato(TransferEmpleado transfer);
	public void especificarBaja(TransferEmpleado transfer);
	public void especificarTraslado(TransferEmpleado transfer);
	public void cambioDepartamento(TransferEmpleado transfer);
}
