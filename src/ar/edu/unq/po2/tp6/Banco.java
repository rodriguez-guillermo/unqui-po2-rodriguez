package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Cliente> clientes;
	private List<SolicitudCredito> solicitudes;
	
	public Banco(List<Cliente> clientes) {
		
		this.clientes = clientes;
		this.solicitudes = new ArrayList<SolicitudCredito>();
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public List<SolicitudCredito> getSolicitudes() {
		return solicitudes;
	}
	
	public void addCliente(Cliente clienteAAgregar) {
		this.clientes.add(clienteAAgregar);
	}
	
//	public void registrarSolicitudDeCreditoPor(Cliente clienteARegistrar, 
//											   Double creditoAOtorgar, 
//											   Integer plazoAPagar) {
//		new SolicitudCredito(clienteARegistrar, plazoAPagar, creditoAOtorgar);
//	}
}
