package tp5_Solid_BancoYPrestamos;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HipotecarioTest {

	private Cliente cliente;
	
	private Hipotecario soli2;
	private Propiedad propiedad;
	
	



	@BeforeEach
	void setUp() throws Exception {
		this.propiedad = new Propiedad("AltoRancho", "CalleFalsa 123", 100000);
		
		this.cliente = new Cliente("Nicolino", "Locche", "CalleFalsa 123", 45, 2000);
		
		this.soli2 = new Hipotecario(cliente, 10000, 12, propiedad);
	}

	
	
	@Test
	void testLaSolicitudHipotecariaSabeValidarSiUnaSolicitudEsValida() {
		assertTrue(soli2.evaluarCredito());
	}
	
	@Test
	void testLaSolicitudHipotecariaSabeValidarSiUnaSolicitudTieneUnMontoValido() {
		assertTrue(soli2.esMontoValido());
	}
	
	@Test
	void testLaSolicitudHipotecariaSabeValidarSiUnaSolicitudTieneUnaEdadValida() {
		assertTrue(soli2.tieneEdadValida());
	}
	


}
