package tp5_Solid_BancoYPrestamos;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonalTest {

	
	private Cliente cliente;
	private Personal soli1;

	
	



	@BeforeEach
	void setUp() throws Exception {
		
		this.cliente = new Cliente("Nicolino", "Locche", "CalleFalsa 123", 45, 200000);
		this.soli1 = new Personal(cliente, 10000, 6);
		
	}

	@Test
	void testLaSolicitudPersonalSabeEvaluarElCreditoCorrectamente() {
		assertTrue(soli1.evaluarCredito());
	}
	
	@Test
	void testLaSolicitudPersonalSabeEvaluarSiElMontoEsValidoCorrectamente() {
		assertTrue(soli1.esMontoValido());
	}
	
	@Test
	void testLaSolicitudPersonalSabeEvaluarSiElCLienteCumpleConLosIngresosNecesarios() {
		assertTrue(soli1.cumpleConIngresos());
	}
}
	
