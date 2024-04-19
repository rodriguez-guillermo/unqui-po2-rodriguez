package ar.edu.unq.po2.tp5;

public abstract class Factura implements IPagable{
	
	private IAgencia agencia;
	
	public Factura(IAgencia agencia) {
		this.agencia = agencia;
	}
	
	private IAgencia getAgencia() {
		return agencia;
	}
	
	public void registrar() {
		this.getAgencia().registrarPago(this);
	}
	
	public abstract Double calcularImporte();
}