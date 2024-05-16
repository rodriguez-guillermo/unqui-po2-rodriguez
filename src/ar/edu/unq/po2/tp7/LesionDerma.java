package ar.edu.unq.po2.tp7;

public enum LesionDerma {
	
	ROJO("Hematoma", 1), 
	GRIS("Hinchazon", 2), 
	AMARILLO("Laceracion", 3), 
	MIEL("Curado", 4);
	
	String definicion;
	int nivelDeRiesgo;	//Si lo tipo con el wrapper Integer, cuando haga el test getNivelDeRiesgo, se rompe. ??
	
	LesionDerma(String definicion, Integer nivelDeRiesgo){
		this.definicion = definicion;
		this.nivelDeRiesgo = nivelDeRiesgo;
	}

	public String getDefinicion() {
		return definicion;
	}

	public int getNivelDeRiesgo() {
		return nivelDeRiesgo;
	}
	
	public LesionDerma proximoColor() {
		int numProx = (this.ordinal() + 1)% values().length;
			return LesionDerma.values()[numProx];
		}
}
