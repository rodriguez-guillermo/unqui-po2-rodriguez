package ar.edu.unq.po2.tp5;

import java.util.List;

public class Caja {
	
	private List<IPagable> pagables;
	
	public Caja(List<IPagable> pagables) {
		
		this.pagables = pagables;
	}
	
	public List<IPagable> getPagables(){
		
		return this.pagables;
	}
	
	public Double calcularMontoTotalDeCompra() {
		
		return this.getPagables().stream()
				.mapToDouble(pagable -> pagable.calcularImporte())
				.sum();
	}
	
	public void registrarProductos() {
		
		this.getPagables().stream().
				forEach(pagable -> pagable.registrar());
	}
}