package empleado.capadepresentacion.controlador;

import java.util.List;
import java.util.Stack;

import usuario.capadenegocio.TipoFacultad;
import empleado.capadenegocio.logica.Empleados;
import empleado.capadenegocio.reglas.Contrato;
import empleado.capadenegocio.reglas.Empleado;
import empleado.capadenegocio.reglas.EmpleadoPDI;
import empleado.capadenegocio.reglas.EmpleadoVista;
import empleado.capadenegocio.reglas.TipoBaja;
import empleado.capadenegocio.transferencia.TransferEmpleado;
import empleado.capadenegocio.transferencia.TransferInt;
import empleado.capadepresentacion.vista.VistaAniadirEmpleadoPAS;
import empleado.capadepresentacion.vista.VistaAniadirEmpleadoPDI;
import empleado.capadepresentacion.vista.VistaCambioContratos;
import empleado.capadepresentacion.vista.VistaCambioDepartamento;
import empleado.capadepresentacion.vista.VistaEliminarEmpleado;
import empleado.capadepresentacion.vista.VistaEspecificarBaja;
import empleado.capadepresentacion.vista.VistaFichaEmpleado;
import empleado.capadepresentacion.vista.VistaGenerica;
import empleado.capadepresentacion.vista.VistaListaEmpleados;
import empleado.capadepresentacion.vista.VistaTrasladoFacultad;
import empleado.capadepresentacion.vista.gestoreventos.VistaAniadirEmpleadoListener;
import empleado.capadepresentacion.vista.gestoreventos.VistaCambioContratosListener;
import empleado.capadepresentacion.vista.gestoreventos.VistaCambioDepartamentoListener;
import empleado.capadepresentacion.vista.gestoreventos.VistaEliminarEmpleadoListener;
import empleado.capadepresentacion.vista.gestoreventos.VistaEspecificarBajaListener;
import empleado.capadepresentacion.vista.gestoreventos.VistaFichaEmpleadoListener;
import empleado.capadepresentacion.vista.gestoreventos.VistaListaEmpleadosListener;
import empleado.capadepresentacion.vista.gestoreventos.VistaTrasladoFacultadListener;

public class Controlador implements VistaAniadirEmpleadoListener,
		VistaCambioContratosListener, VistaCambioDepartamentoListener,
		VistaEliminarEmpleadoListener, VistaEspecificarBajaListener,
		VistaFichaEmpleadoListener, VistaListaEmpleadosListener,
		VistaTrasladoFacultadListener {
	
	private Empleados servicioAplicacionEmpleado;
	private FactoriaVistas factoriaVistas;
	
	private Stack<VistaGenerica> vistasPresentadas;
	
	public Controlador(Empleados servicioAplicacionEmpleado, FactoriaVistas factoria) {
		this.servicioAplicacionEmpleado = servicioAplicacionEmpleado;
		this.factoriaVistas = factoria;
		vistasPresentadas = new Stack<VistaGenerica>();
	}
	
	public void lanzar() {
		TransferInt transfer = new TransferInt(0);
		List<EmpleadoVista> lista = servicioAplicacionEmpleado.listaEmpleados(transfer).getList();
		VistaListaEmpleados vista = factoriaVistas.vistaListaEmpleados(this);
		vista.actualizarPagina(lista, 0);
		mostrarVista(vista);
	}
	
	public void avanzarAVista(VistaGenerica vista) {
		mostrarVista(vista);
	}
	
	public void retrocederAVistaAnterior() {
		if (!vistasPresentadas.isEmpty()) {
			ocultarUltimaVista();
		}
	}
	
	// EVENT LISTENERS
	@Override
	public void trasladoFacultad(Empleado empleado, TipoFacultad facultad) {
		empleado.setFacultad(facultad);
		TransferEmpleado transfer = new TransferEmpleado(empleado);
		servicioAplicacionEmpleado.especificarTraslado(transfer);
	}

	@Override
	public void empleadoSeleccionado(int idEmpleado) {
		VistaFichaEmpleado vista = factoriaVistas.vistaFichaEmpleado(this);
		TransferInt transfer = new TransferInt(idEmpleado);
		Empleado empleado = servicioAplicacionEmpleado.perfilCompletoEmpleado(transfer).getEmpleado();
		vista.setEmpleado(empleado);
		mostrarVista(vista);
	}
	
	@Override
	public void mostrarNuevaPagina(int pagina) {
		VistaListaEmpleados vistaAct = (VistaListaEmpleados)vistasPresentadas.peek();
		TransferInt transfer = new TransferInt(pagina);
		List<EmpleadoVista> lista = servicioAplicacionEmpleado.listaEmpleados(transfer).getList();
		vistaAct.actualizarPagina(lista, pagina);
	}
	
	@Override
	public void aniadirEmpleadoPASPulsado() {
		VistaAniadirEmpleadoPAS vista = factoriaVistas.vistaAniadirEmpleadoPAS(this);
		mostrarVista(vista);
	}

	@Override
	public void aniadirEmpleadoPDIPulsado() {
		VistaAniadirEmpleadoPDI vista = factoriaVistas.vistaAniadirEmpleadoPDI(this);
		mostrarVista(vista);
	}

	@Override
	public void cambiarContratoPulsado(Empleado empleado) {
		VistaCambioContratos vista = factoriaVistas.vistaCambioContratos(this);
		vista.setEmpleado(empleado);
		mostrarVista(vista);
	}

	@Override
	public void especificarBajaPulsado(Empleado empleado) {
		VistaEspecificarBaja vista = factoriaVistas.vistaEspecificarBaja(this);
		vista.setEmpleado(empleado);
		mostrarVista(vista);
	}

	@Override
	public void especificarTrasladoPulsado(Empleado empleado) {
		VistaTrasladoFacultad vista = factoriaVistas.vistaTrasladoFacultad(this);
		vista.setEmpleado(empleado);
		mostrarVista(vista);
	}

	@Override
	public void especificarCambioDepartamentoPulsado(Empleado empleado) {
		if (empleado instanceof EmpleadoPDI) {
			VistaCambioDepartamento vista = factoriaVistas.vistaCambioDepartamento(this);
			vista.setEmpleado((EmpleadoPDI)empleado);
			mostrarVista(vista);
		} else {
			// Show error
		}
	}

	@Override
	public void eliminarFichaPulsado(Empleado empleado) {
		VistaEliminarEmpleado vista = factoriaVistas.vistaEliminarEmpleado(this);
		vista.setEmpleado(empleado);
		mostrarVista(vista);
	}

	@Override
	public void darDeBaja(Empleado empleado, TipoBaja baja) {
		empleado.setTipoBaja(baja);
		TransferEmpleado transfer = new TransferEmpleado(empleado);
		servicioAplicacionEmpleado.especificarBaja(transfer);
	}

	@Override
	public void cancelarBaja(Empleado empleado) {
		darDeBaja(empleado, TipoBaja.ALTA);
	}

	@Override
	public void eliminarEmpleadoPulsado(Empleado empleado) {
		TransferEmpleado transfer = new TransferEmpleado(empleado);
		servicioAplicacionEmpleado.eliminarEmpleado(transfer);
	}

	@Override
	public void cambioDepartamento(EmpleadoPDI empleado, String departamento) {
		empleado.setDepartamento(departamento);
		TransferEmpleado transfer = new TransferEmpleado(empleado);
		servicioAplicacionEmpleado.cambioDepartamento(transfer);
	}

	@Override
	public void contratoCambiado(Empleado empleado, Contrato nuevoContrato) {
		empleado.setContrato(nuevoContrato);
		TransferEmpleado transfer = new TransferEmpleado(empleado);
		servicioAplicacionEmpleado.cambiarContrato(transfer);
	}

	@Override
	public void empleadoAniadido(Empleado empleado) {
		TransferEmpleado transfer = new TransferEmpleado(empleado);
		servicioAplicacionEmpleado.aniadirEmpleado(transfer);
	}

	// HELPERS PRIVADOS
	private void mostrarVista(VistaGenerica vista) {
		vistasPresentadas.add(vista);
		vista.mostrarVista();
	}
	
	private void ocultarUltimaVista() {
		VistaGenerica vista = vistasPresentadas.pop();
		vista.ocultarVista();
	}
}


