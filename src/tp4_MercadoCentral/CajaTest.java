package tp4_MercadoCentral;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	Producto producto1;
	Producto producto2;
	ProductoDeCooperativa productoDeCoop1;
	ProductoDeCooperativa productoDeCoop2;
	Caja cajaregi;
	

	@BeforeAll
	static void setUpBeforeClass() {
	
		
		
	}

	@BeforeEach
	void setUp() throws Exception {
		producto1 = new Producto((Double) 100.0, 612, "Mayonesa");
		producto2 = new Producto((Double) 10.0, 1024, "Chicles");
		
		productoDeCoop1 = new ProductoDeCooperativa((Double) 500.0, 10, "Cafe");
		productoDeCoop2 = new ProductoDeCooperativa((Double) 120.0, 4, "Mate");
		
		cajaregi = new Caja();
	}

	@Test
	void testCaja001UnaCajaEmpiezaCon0Productos() {		
		assertEquals(cajaregi.getCantidadDeProductos(), 0);			
	}
	
	@Test
	void testCaja002UnaCajaAgregaUnProductoYAumentaSuCantidad() {
		this.cajaregi.registrarProducto(producto1);
		assertEquals(cajaregi.getCantidadDeProductos(), 1);			
	}
	
	@Test
	void testCaja003UnaCajaRegistradoPuedeGuardarProductosYProductosDeCooperativa() {		
		this.cajaregi.registrarProducto(producto1);
		this.cajaregi.registrarProducto(productoDeCoop1);
		assertEquals(cajaregi.getCantidadDeProductos(), 2);			
	}
	
	@Test
	void testCaja004UnaCajaSabeCalcularSuprecioTotal() {		
		this.cajaregi.registrarProducto(producto1);
		this.cajaregi.registrarProducto(productoDeCoop1);
		assertEquals(cajaregi.getMonto(), 550.0);			
	}
	
	
	
}
