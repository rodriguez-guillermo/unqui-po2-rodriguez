package ar.edu.unq.po2.tp6;

public abstract class SolicitudCredito {
	
	private Integer cantidadDeCuotas;
	private Double montoSolicitado;
	private Cliente solicitante;
	
	public SolicitudCredito(Cliente cliente, Integer cantidadDeCuotas, Double montoSolicitado) {
		super();
		this.solicitante = cliente;
		this.cantidadDeCuotas = cantidadDeCuotas;
		this.montoSolicitado = montoSolicitado;
	}

	public Integer getCantidadDeCuotas() {
		return cantidadDeCuotas;
	}

	public Double getMontoSolicitado() {
		return montoSolicitado;
	}
	
	public Cliente getSolicitante() {
		return solicitante;
	}
	public Double calcularCuotaMensual() {
		return this.getMontoSolicitado() / this.getCantidadDeCuotas();
	}
	
	public Boolean esCuotaMenorAlPorcentaje(Integer porcentaje) {
		return this.calcularCuotaMensual() < (this.getSolicitante().getSueldoNetoMensual() * porcentaje) / 100;
	}
	
	public abstract Boolean esAceptado();
	
}
