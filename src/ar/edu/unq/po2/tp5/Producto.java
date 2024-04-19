package ar.edu.unq.po2.tp5;

public class Producto {

	private Double precioBase;
	private Integer stock;
	private Double iva;
	
	public Producto(Double precioBase, Integer stock) {	
	
		this.precioBase = precioBase;
		this.stock = stock;
		this.iva = 21d;
	}
	
	public Double getPrecioBase() {	
	
		return this.precioBase;
	}
	
	public Integer getStock() {	
	
		return this.stock;
	}
	
	public Double getIva() {
		
		return this.iva;
	}
	
	// Calcula el monto del precio base + el monto del IVA.
	public Double calcularPrecioFinal() {	
		
		return this.getPrecioBase() + this.calcularIvaProducto();
	}

	double calcularIvaProducto() {
		
		return (this.getPrecioBase() * this.getIva()) / 100;
	}
	
	public void registrar() throws Exception {	
		
		if (this.getStock() > 0) {
			this.reducirStock();
		} else {
			throw new Exception("No hay stock suficiente");
		}
	}
	
	// Reduce en 1 unidad el stock.
	Integer reducirStock() {
		
		return stock --;
	}
}