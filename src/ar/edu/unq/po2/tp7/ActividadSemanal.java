package ar.edu.unq.po2.tp7;

public class ActividadSemanal implements Comparable<ActividadSemanal>{
	
	private DiaDeLaSemana dia;
	private int horarioInicio;
	private int duracion;
	private Deporte deporte;
	
	public ActividadSemanal(DiaDeLaSemana dia, int horario, Deporte deporte, int duracion) {
		super();
		this.dia = dia;
		this.horarioInicio = horario;
		this.deporte = deporte;
		this.duracion = duracion;
	}

	public int getCosto() {
		return this.valorPorDia() + this.valorPorComplejidad();
	}

	private int valorPorComplejidad() {
		return deporte.getComplejidad() * 200;
	}

	private int valorPorDia() {
		if (dia.esDiaConcurrente()) {
			return 1000;
		} else {
			return 500;
		}
	}
	
	public boolean esDeComplejidad(int c) {
		return deporte.getComplejidad() == c;
	}
	
	public int getDuracion() {
		return duracion;
	}

	@Override
	public int compareTo(ActividadSemanal act) {
		return this.getCosto() - act.getCosto();
	}

	public Deporte getDeporte() {
		return deporte;
	}
	
	@Override 
	public String toString() {
		return "Deporte: " + deporte.name() +  
				". Dia: " + dia.name() + " a las " + horarioInicio + 
				". Duracion: " + duracion + " hora/s.";
	}

	public boolean esActividadDe(Deporte act) {
		return deporte == act;
	}
	
}
