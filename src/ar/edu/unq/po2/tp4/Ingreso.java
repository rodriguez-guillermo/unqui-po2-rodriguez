package ar.edu.unq.po2.tp4;

public class Ingreso {
	
	private String mes;
	private String concepto;
	private Double montoPercibido;
	
	public Ingreso(String mes, String concepto, Double montoPercibido) {
		this.mes = mes;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}

	public Double getMontoPercibido() {
		return this.montoPercibido;
	}

	public Double getMontoImponible() {
		return this.getMontoPercibido();
	}
	
	public String getMes() {
		return mes;
	}
	
	public String getConcepto() {
		return concepto;
	}

}
