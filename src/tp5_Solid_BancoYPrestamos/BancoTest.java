package tp5_Solid_BancoYPrestamos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest extends Banco {
	private Banco banco;
	private Cliente cliente;
	private SolicitudDeCredito soli1;
	private SolicitudDeCredito soli2;
	private Propiedad propiedad;
	
	
	
	


	@BeforeEach
	void setUp() throws Exception {
			this.propiedad = new Propiedad("AltoRancho", "CalleFalsa 123", 100000);
			this.banco = new Banco();
			this.cliente = new Cliente("Nicolino", "Locche", "CalleFalsa 123", 45, 2000);
			this.soli1 = new Personal(cliente, 10000, 6);
			this.soli2 = new Hipotecario(cliente, 10000, 12, propiedad);
		}
		

	
	@Test
	public void testElBancoAlNoTieneClientesAlInstanciarte() {	
		assertEquals(banco.getClientes().size(), 0);
		
	}
	
	
	
	
	@Test
	public void testElBancoPuedeAgregarUnCliente() {
		banco.agregarCliente(cliente);
		assertEquals(banco.getClientes().size(), 1);
			
	}
	
	@Test
	public void testElBancoAlNoTieneSolicitudesAlInstanciarte() {	
		assertEquals(banco.getSolicitudes().size(), 0);
	}
	
	public void testElBancoPuedeAgregarSolicitudes() {	
		banco.generarSolicitud(soli2);
		assertEquals(banco.getSolicitudes().size(), 1);
	}
	
	
	@Test
	public void testElBancoPuedeOtorgarUnCreditoAUnCliente() {
		banco.otorgarCredito(cliente, soli1);
		assertEquals(cliente.recibirCredito(soli1.getMonto()), soli1.getMonto());
			
	}
	
	
}
