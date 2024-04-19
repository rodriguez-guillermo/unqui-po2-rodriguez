package ar.edu.unq.po2.tp5;

import java.util.List;

public class Caja {
	
	private List<Producto> productos;

	
	public Caja(List<Producto> productos) {
		
		this.productos = productos;
	}
	
	public List<Producto> getProductos(){
		
		return this.productos;
	}
	
	public Double calcularMontoTotalDeCompra() {
		
		return this.getProductos().stream()
				.mapToDouble(producto -> producto.calcularPrecioFinal())
				.sum();
	}
	
	public void registrarProductos() {
		
		this.getProductos().stream()
				.forEach(producto -> {
					try {
						producto.registrar();
					} catch (Exception e) {
						e.printStackTrace();
					}
				});
	}
}