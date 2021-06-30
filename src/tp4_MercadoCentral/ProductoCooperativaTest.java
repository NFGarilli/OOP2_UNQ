package tp4MercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCooperativaTest {
	

	ProductoDeCooperativa productoDeCoop1;
	ProductoDeCooperativa productoDeCoop2;
	

	@BeforeAll
	static void setUpBeforeClass() {
	
		
		
	}

	@BeforeEach
	void setUp() throws Exception {
	
		
		productoDeCoop1 = new ProductoDeCooperativa((Double) 500.0, 10, "Cafe");
		productoDeCoop2 = new ProductoDeCooperativa((Double) 120.0, 4, "Mate");
		
	
	}
	
	
	@Test
	void testCaja001ElPrecioDelProductoDeCoop1EsDe550() {		
		assertEquals(productoDeCoop1.getPrecio(), 450.0);			
	}

	@Test
	void testCaja002ElIvaDelProductoDeCooperativa1EsDe50() {	
		assertEquals(productoDeCoop1.getIva(), 50.0);			
	}
}