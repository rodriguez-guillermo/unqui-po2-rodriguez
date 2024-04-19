package ar.edu.unq.po2.tp5;

public class ProductoCooperativo extends Producto{
	
	private final Double descuentoPorcentaje;
	
	public ProductoCooperativo(Double precioBase, Integer stock) {
		
		super(precioBase, stock);
		this.descuentoPorcentaje = 10d;
	}
	
	public Double getDescuentoPorcentaje() {
		
		return this.descuentoPorcentaje;
	}
	
	@Override
	public Double calcularImporte() {
		
		return super.calcularImporte() - this.calcularDescuento();
	}

	Double calcularDescuento() {
	
		return (this.getPrecioBase() * this.getDescuentoPorcentaje()) / 100;
	}
}