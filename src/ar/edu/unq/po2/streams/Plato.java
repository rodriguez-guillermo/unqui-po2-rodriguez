package ar.edu.unq.po2.streams;

import java.util.List;

public class Plato {
	
	private String nombre;
	private Double precio;
	final Double iva = 21.0;
	
	
	public Plato(String nombre, Double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Double getPrecioConIVA() {
		return precio * iva;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	public Double sumaDePrecios(List<Plato> platos) {
		
		return platos.stream().filter(plato -> plato.getPrecioConIVA() < 1000 * iva)
				.mapToDouble(plato -> plato.getPrecioConIVA()).sum();
	}
}
