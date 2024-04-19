package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura{
	
	private final Double tasaDeServicio;
	
	public Impuesto(IAgencia agencia, Double tasaDeServicio) {
		super(agencia);
		this.tasaDeServicio = tasaDeServicio;
	}
	
	private Double getTasaDeServicio() {
		return tasaDeServicio;
	}

	@Override
	public Double calcularImporte() {

		return this.getTasaDeServicio();
	}
}