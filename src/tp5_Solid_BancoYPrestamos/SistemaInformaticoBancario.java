package tp5_Solid_BancoYPrestamos;


// Java no deja crear clases static
// https://stackoverflow.com/questions/7486012/static-classes-in-java
// En stackoverflow encontre que java no deja que las clases de "Top-Level" sean static.
// Sin embargo, es posible simular una clase static declarandola como final y todos sus metodos como staticos.

public static class SistemaInformaticoBancario {

	public static void agregarNuevoClienteAlBanco(Cliente cliente, Banco banco) {
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
	