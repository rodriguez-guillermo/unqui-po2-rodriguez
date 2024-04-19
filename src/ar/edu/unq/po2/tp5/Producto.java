package ar.edu.unq.po2.tp5;

public class Producto implements IPagable{

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
	
	double calcularIvaProducto() {
		
		return (this.getPrecioBase() * this.getIva()) / 100;
	}
	
	public void registrar(){	
		
		 this.stock --;
	}

	@Override
	public Double calcularImporte() {
	
		return this.getPrecioBase() + this.calcularIvaProducto();
	}
}