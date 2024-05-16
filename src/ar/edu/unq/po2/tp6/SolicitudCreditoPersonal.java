package ar.edu.unq.po2.tp6;

public class SolicitudCreditoPersonal extends SolicitudCredito {
	
	private static final Double INGRESO_MINIMO = 1500d;
	private static final Integer PORCENTAJE_MENSUAL = 70;

	public SolicitudCreditoPersonal(Cliente cliente, Integer cantidadDeCuotas, Double montoSolicitado) {
		super(cliente, cantidadDeCuotas, montoSolicitado);
	}

	@Override
	public Boolean esAceptado() {
		return this.esCuotaMenorAlPorcentaje(PORCENTAJE_MENSUAL) && 
			   this.tieneIngresosAnualesMayorA(INGRESO_MINIMO);
	}
	
	public Boolean tieneIngresosAnualesMayorA(Double ingresosMinimos) {
		return this.getSolicitante().calcularSueldoNetoAnual() > ingresosMinimos;
	}
}
