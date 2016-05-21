package empleado.capadenegocio.reglas;


import java.util.Date;
public class Contrato {

	private String cuentaBancaria;
	private int horasTrabajo;
	private Date fechaFin;
	private Boolean esTemporal;
	
	public Contrato(String cuenta, int horasTrabajo, Date fechaFin, Boolean esTemp) {
		this.cuentaBancaria = cuenta;
		this.horasTrabajo = horasTrabajo;
		this.fechaFin = fechaFin;
		this.esTemporal = esTemp;
	}

	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	public int getHorasTrabajo() {
		return horasTrabajo;
	}

	public void setHorasTrabajo(int horasTrabajo) {
		this.horasTrabajo = horasTrabajo;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Boolean getEsTemporal() {
		return esTemporal;
	}

	public void setEsTemporal(Boolean esTemporal) {
		this.esTemporal = esTemporal;
	}
}
