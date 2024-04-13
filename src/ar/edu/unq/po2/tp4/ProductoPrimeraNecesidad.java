package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	
	private Double descuento = 0.0;
	
	public ProductoPrimeraNecesidad(String nombre, Double precio) {
		super(nombre, precio);
		descuento = 10d;
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esPrecioCuidado) {
		super(nombre, precio, esPrecioCuidado);
		descuento = 10d;
	}
	
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esPrecioCuidado, Double descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}
	
	@Override
	public Double getPrecio() {
		
		Double montoDeDescuento = (this.precio * this.getDescuento())/100;
	    return this.precio - montoDeDescuento;
	}

	public Double getDescuento() {
		return descuento;
	}

}
