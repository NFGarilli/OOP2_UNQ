package tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bancoYPrestamos.*;

class clientesTest {
	private Banco bancoNacion;
	private Cliente cliente;
	private SolicitudDeCredito solicitud1;
	private SolicitudDeCredito solicitud2;
	private Propiedad casucha;
	

	Cliente camila;
	
	@BeforeEach
	void setUp() {
		camila = new Cliente("Camila", "Ruiz", "AvenidaSiempreViva", 21, 1000);
		casucha = new Propiedad("Casa", "AvenidaSiempreViva", 400000);
		bancoNacion = new Banco();
		solicitud1 = new Personal(camila, 5000, 6);
		solicitud2 = new Hipotecario(camila, 6000, 12, casucha);
	}

	
	@Test
	 void test001(){
		assertTrue(camila.getNombre() == "Camila");		
	}
	@Test
	 void test002(){
			assertTrue(camila.getApellido() == "Ruiz");		
		}
	@Test
	 void test003(){
			assertTrue(camila.getDireccion() == "AvenidaSiempreViva");		
		}
	@Test
	 void test004(){
			assertTrue(camila.getEdad() == 21);		
		}
	@Test
	 void test005(){
			assertTrue(camila.getSueldoNeto() == 1000);		
		}
	
	@Test
	void test006CalcularSueldoNetoAnual() {
		float sueldoAnual = camila.sueldoNetoAnual();
		assertEquals(12000, sueldoAnual);
	}
	
	@Test
	void test007AgregarSolicitudDeCredito() {
		camila.pedirCreditoPersonal(bancoNacion, 4000, 6);
		assertTrue(bancoNacion.getSolicitudes().size() > 0);
	}
	

	
}