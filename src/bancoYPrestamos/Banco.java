package bancoYPrestamos;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudDeCredito> solicitudes;
	
	
	public Banco() {
		super();
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
	}


	public ArrayList<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void agregarCliente(Cliente cliente) {
		 this.getClientes().add(cliente);
	}
	
	public ArrayList<SolicitudDeCredito> getSolicitudes() {
		return solicitudes;
	}
	
	public void setSolicitudes(ArrayList<SolicitudDeCredito> solicitudes) {
		this.solicitudes = solicitudes;
	}
	
	public void generarSolicitud(SolicitudDeCredito solicitud) {
		 this.getSolicitudes().add(solicitud);
	}
	
	public void otorgarCredito(Cliente cliente, SolicitudDeCredito solicitud) {
		solicitud.getCliente().recibirCredito(solicitud.getMonto());
	}
	
}

