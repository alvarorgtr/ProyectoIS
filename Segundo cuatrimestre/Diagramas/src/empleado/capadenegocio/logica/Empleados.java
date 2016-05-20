package empleado.capadenegocio.logica;

import empleado.capadenegocio.transferencia.TransferBusqueda;
import empleado.capadenegocio.transferencia.TransferEmpleado;
import empleado.capadenegocio.transferencia.TransferInt;
import empleado.capadenegocio.transferencia.TransferListEmpleados;

public interface Empleados {
	public void añadirEmpleado(TransferEmpleado transfer);
	public TransferEmpleado perfilCompletoEmpleado(TransferInt transfer);
	public TransferListEmpleados listaEmpleados(TransferInt pagina);
	public void eliminarEmpleado(TransferEmpleado transfer);
	public TransferEmpleado buscarEmpleado(TransferBusqueda transfer);
	
	public void trasladoFacultad(TransferEmpleado transfer);
	public void cambiarContrato(TransferEmpleado transfer);
	public void especificarBaja(TransferEmpleado transfer);
	public void especificarTraslado(TransferEmpleado transfer);
	public void cambioDepartamento(TransferEmpleado transfer);
}
