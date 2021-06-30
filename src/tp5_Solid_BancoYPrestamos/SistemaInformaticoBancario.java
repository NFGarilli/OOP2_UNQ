package bancoYPrestamos;

public class SistemaInformaticoBancario {

	public void agregarNuevoClienteAlBanco(Cliente cliente, Banco banco) {
		banco.agregarCliente(cliente);
	}
	
	public static void agregarNuevaSolicitudAlBanco(SolicitudDeCredito solicitud, Banco banco) {
		banco.generarSolicitud(solicitud);
	}
	
	public static float montoTotalADesembolsar(Banco banco) {
		float montoFinal = 0;
		for(SolicitudDeCredito solicitud: banco.getSolicitudes()) {
			montoFinal+= solicitud.getMonto();
		}
		return montoFinal;
	}
}
	