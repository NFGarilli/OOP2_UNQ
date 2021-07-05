package tp6_Mockito_Poker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTest {

	private Carta cj;
	private Carta cq;
	private Carta ck;
	private Carta ca;
	private Carta c2;
	private Carta c3;
	private Carta c4;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		
			cj = new Carta("J",'C');
			cq = new Carta("Q",'T');
			ck = new Carta("K",'P');
			ca = new Carta("A",'D');
			c2 = new Carta(2,'C');
			c3 = new Carta(3,'T');
			c4 = new Carta(4,'P');
		
	}

	@Test
	void test001UnaCartaConValorJSePuedeInstanciarYTieneDeValor11() {
		Integer once = 11;
		assertTrue(cj.getValor().equals(once));
	}
	
	@Test
	void test002UnaCartaConValorQSePuedeInstanciarYTieneDeValor12() {
		Integer doce = 12;
		assertTrue(cq.getValor().equals(doce));
	}
	
	@Test
	void test003UnaCartaConValorKSePuedeInstanciarYTieneDeValor13() {
		Integer trece = 13;
		assertTrue(ck.getValor().equals(trece));
	}
	
	@Test
	void test004UnaCartaConValorASePuedeInstanciarYTieneDeValor14() {
		Integer catorceXD = 14;
		assertTrue(ca.getValor().equals(catorceXD));
	}
	

	@Test
	void test005LaCartaConValor2NoEsMayorALaCartaConValor4() {
		
		assertFalse(c2.esMayor(c4));
	}
	
	@Test
	void test006LaCartaConValorKEsMayorALaCartaConValorQ() {
		
		assertTrue(ck.esMayor(cq));
	}
	
	@Test
	void test007LaCartaConValorQEsMayorALaCartaConValorJ() {
		
		assertTrue(cq.esMayor(cj));
	}
	
	@Test
	void test008LaCartaConValorKEsMayorALaCartaConValorJ() {
		
		assertTrue(ck.esMayor(cj));
	}
	
	@Test
	void test009aCartaConValorJNoEsMayorALaCartaConValorQ() {
		
		assertFalse(cj.esMayor(cq));
	}
	
	@Test
	void test010LaCartaConValorJNoEsMayorALaCartaConValorK() {
		
		assertFalse(cj.esMayor(ck));
	}
	
	@Test
	void test011LaCartaConValorQNoEsMayorALaCartaConValorK() {
		
		assertFalse(cq.esMayor(ck));
	}
	
	
	@Test
	void test012LaCartaConJDeCorazonesEsDelMismoPaloQueEl2DeCorazones() {
		
		assertTrue(cj.esDeMismoPalo(c2));
	}
	
	@Test
	void test013LaCartaConJDeCorazonesNoEsDelMismoPaloQueEl3DeTreboles() {
		
		assertFalse(cj.esDeMismoPalo(c3));
	}
	
	
	
	
}
