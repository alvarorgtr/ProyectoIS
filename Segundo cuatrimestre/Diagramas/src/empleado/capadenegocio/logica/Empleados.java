package empleado.capadenegocio.logica;

import empleado.capadenegocio.transferencia.TransferBusqueda;
import empleado.capadenegocio.transferencia.TransferEmpleado;
import empleado.capadenegocio.transferencia.TransferInt;
import empleado.capadenegocio.transferencia.TransferListEmpleados;

public interface Empleados {
	public void añadirEmpleado(TransferEmpleado transfer);
	public TransferEmpleado perfilCompletoEmpleado(TransferInt transfer);
	public TransferListEmpleados listaEmpleados(TransferInt pagina);
	public void eliminarEmpleado(TransferInt transfer);
	public TransferListEmpleados buscarEmpleado(TransferBusqueda transfer);
	public void modificarEmpleado(TransferEmpleado transfer);
}
