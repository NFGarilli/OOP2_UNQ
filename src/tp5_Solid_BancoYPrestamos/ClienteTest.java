package tp5_Solid_BancoYPrestamos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {
	
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
	void testElClienteSabeCalcularSuSueldoNetoAnual() {
		assertEquals(cliente.sueldoNetoAnual(), 2400);
	}
	
	
	@Test
	void testElClientePuedeSolicitarUnCreditoHipotercario() {
		cliente.solicitarCreditoHipotecario(banco, 10000, 6, propiedad);	
		
	}

}
