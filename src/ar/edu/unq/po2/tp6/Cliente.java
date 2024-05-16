package ar.edu.unq.po2.tp6;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private Integer edad;
	private Double sueldoNetoMensual;
	private Propiedad garantia;
	
	public Cliente(String nombre, 
				   String apellido, 
				   String direccion, 
				   Integer edad, 
				   Double sueldoNetoMensual,
				   Propiedad garantia) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.garantia = garantia;
	}

	public Cliente(String nombre, 
				   String apellido, 
				   String direccion, 
				   Integer edad, 
				   Double sueldoNetoMensual) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.garantia = null;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public Integer getEdad() {
		return edad;
	}

	public Double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public String getNombreYApellido() {
		return this.getNombre() + " " + this.getApellido();
	}

	public Propiedad getGarantia() {
		
		if (garantia == null){
			throw new IllegalArgumentException("El cliente no tiene una propiedad como garantía.");
		}else {
			return garantia;
		}
	}
	
//	public void solicitarAlBancoCreditoPor(Banco banco, Double importeASolicitar, Integer mesesAPagar) {
//		banco.registrarSolicitudDeCreditoPor(this, importeASolicitar, mesesAPagar);
//	}
	
	public Double calcularSueldoNetoAnual() {
		return this.getSueldoNetoMensual() * 12;
	}
}
