package ar.edu.unq.po2.tp7;

public enum DiaDeLaSemana {
	
	LUNES(false), MARTES(false), MIERCOLES(false), JUEVES(true), VIERNES(true), SABADO(true), DOMINGO(true);

	private boolean diaConcurrente;
	
	DiaDeLaSemana(boolean diaConcurrente) {
		this.diaConcurrente = diaConcurrente;
	}
	boolean esDiaConcurrente() {
		return diaConcurrente;
	}
}
