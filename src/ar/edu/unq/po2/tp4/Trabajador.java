package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private String nombre;
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();
	private final Double porcentajeImpuesto = 2d;
	
	public Trabajador(String nombre) {
		this.nombre = nombre;
	}
	
	public Trabajador(String nombre, List<Ingreso> ingresos) {
		this.nombre = nombre;
		this.ingresos = ingresos;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public List<Ingreso> getIngresos(){
		return this.ingresos;
	}
	
	public void addIngreso(Ingreso ingresoAAgregar) {
		this.getIngresos().add(ingresoAAgregar);
	}
	
	public Double getTotalPercibido() {
		return this.getIngresos().stream()
						.mapToDouble(ingreso -> ingreso.getMontoPercibido())
						.sum();
	}
	
	public Double getMontoImponible() {
		return this.getIngresos().stream()
						.mapToDouble(ingreso -> ingreso.getMontoImponible())
						.sum();	
	}
	
	public Double getImpuestoAPagar(){
		
	    return this.getMontoImponible() * (this.getPorcentajeImpuesto()/100);
	}
	
	public Double getPorcentajeImpuesto() {
		return porcentajeImpuesto;
	}
	
}
