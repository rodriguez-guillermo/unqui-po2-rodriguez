package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso{

	private Double cantidadHorasExtras;
	
	public IngresoPorHorasExtras(String mes, String concepto, Double montoPercibido, Double cantidadHorasExtras) {
		super(mes, concepto, montoPercibido);
		this.cantidadHorasExtras = cantidadHorasExtras;
	}

	public Double getCantidadHorasExtras() {
		return cantidadHorasExtras;
	}

	@Override
	public Double getMontoImponible() {
		return 0d;
	}
}
