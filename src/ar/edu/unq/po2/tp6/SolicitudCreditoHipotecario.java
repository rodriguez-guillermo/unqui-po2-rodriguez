package ar.edu.unq.po2.tp6;

public class SolicitudCreditoHipotecario extends SolicitudCredito {

	private static final Integer EDAD_LIMITE = 65;
	private static final Integer PORCENTAJE_GARANTIA = 70;
	private static final Integer PORCENTAJE_MENSUAL = 50;

	public SolicitudCreditoHipotecario(Cliente cliente, Integer cantidadDeCuotas, Double montoSolicitado) {
		super(cliente, cantidadDeCuotas, montoSolicitado);
	}

	@Override
	public Boolean esAceptado() {
		return this.esCuotaMenorAlPorcentaje(PORCENTAJE_MENSUAL) &&
			   this.esMontoMenorAlPorcentajeDeGarantia(PORCENTAJE_GARANTIA) &&
			   this.seraMayorA(EDAD_LIMITE);
	}

	private Boolean esMontoMenorAlPorcentajeDeGarantia(Integer porcentaje) {
		return this.getMontoSolicitado() < 
			  (this.getSolicitante().getGarantia().getValorFiscal() * porcentaje) / 100;
	}
	
	private Boolean seraMayorA(Integer edadLimite) {
		return false;
	}
}
