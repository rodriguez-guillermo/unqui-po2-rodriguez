package ar.edu.unq.po2.tp5;

public class Servicio extends Factura{

	private Double costoPorUnidad;
	private Double unidadesConsumidas;
	
	public Servicio(IAgencia agencia, Double costoPorUnidad, Double unidadesConsumidas) {
		super(agencia);
		this.costoPorUnidad = costoPorUnidad;
		this.unidadesConsumidas = unidadesConsumidas;
	}
	
	public Double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public Double getUnidadesConsumidas() {
		return unidadesConsumidas;
	}

	@Override
	public Double calcularImporte() {
		
		return this.getCostoPorUnidad() * this.getUnidadesConsumidas();
	}
}