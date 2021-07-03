package tp4_MercadoCentral;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ProductoTest {
	
	Producto producto1;
	Producto producto2;
	
	

	@BeforeAll
	static void setUpBeforeClass() {
	
		
		
	}

	@BeforeEach
	void setUp() throws Exception {
		producto1 = new Producto((Double) 100.0, 612, "Mayonesa");
		producto2 = new Producto((Double) 10.0, 1024, "Chicles");
		
	}
	
	
	@Test
	void testCaja001ElPrecioDelProducto1EsDe100() {		
		assertEquals(producto1.getPrecio(), 100.0);			
	}

	@Test
	void testCaja002ElStockDelProducto1EsDe612() {		
		assertEquals(producto1.getStock(), 612);			
	}
	
	@Test
	void testCaja003SeDecrementaEnUnoElStockDelProducto1() {	
		this.producto1.decrementarStock();
		assertEquals(producto1.getStock(), 611);			
	}








}