package tp6_Mockito_Poker;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadasTest {

	Carta c1;
	Carta c2;
	Carta c3;
	Carta c4;
	Carta c5;
	Jugada jugada1;
	Jugada jugada2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		c1 = mock(Carta.class);
		c2 = mock(Carta.class);
		c3 = mock(Carta.class);
		c4 = mock(Carta.class);
		c5 = mock(Carta.class);
	}

	@Test
	void test001UnaJugadaDeValor25ConoceSuValor() {
		
		//Set UP
		when(c1.getValor()).thenReturn(5);
		jugada1 = new Jugada(c1,c1,c1,c1,c1);
		
		//EXCERCISE
		Integer valorJugada = jugada1.getValorJugada();
		
		//VERIFY
		assertEquals(valorJugada, 25);
	}
	
	@Test
	void test002UnaJugadaDeValor30ConoceSuValor() {
		
		//Set UP
		when(c1.getValor()).thenReturn(6);
		jugada1 = new Jugada(c1,c1,c1,c1,c1);
		
		//EXCERCISE
		Integer valorJugada = jugada1.getValorJugada();
		
		//VERIFY
		assertEquals(valorJugada, 30);
	}
	
	@Test
	void test003UnaJugadaDeValor30EsMejorQueUnaDeValor25() {
		
		Integer num1 = 6;
		Integer num2 = 5;
		//Set UP
		when(c1.getValor()).thenReturn(num1,num2);
		when(c2.getValor()).thenReturn(num1,num2);
		when(c3.getValor()).thenReturn(num1,num2);
		when(c4.getValor()).thenReturn(num1,num2);
		when(c5.getValor()).thenReturn(num1,num2);  
		jugada1 = new Jugada(c1,c2,c3,c4,c5);
		jugada2 = new Jugada(c1,c2,c3,c4,c5);
		
		//EXCERCISE
		Boolean gano = jugada1.leGanaA(jugada2);
		
		//VERIFY
		assertTrue(gano);
	}

	
	@Test
	void test004UnaJugadaDeValor25NoEsMejorQueUnaDeValor30() {
		
		Integer num1 = 5;
		Integer num2 = 6;
		//Set UP
		when(c1.getValor()).thenReturn(num1,num2);
		when(c2.getValor()).thenReturn(num1,num2);
		when(c3.getValor()).thenReturn(num1,num2);
		when(c4.getValor()).thenReturn(num1,num2);
		when(c5.getValor()).thenReturn(num1,num2);  
		jugada1 = new Jugada(c1,c2,c3,c4,c5);
		jugada2 = new Jugada(c1,c2,c3,c4,c5);
		
		//EXCERCISE
		Boolean gano = jugada1.leGanaA(jugada2);
		
		//VERIFY
		assertFalse(gano);
	}
}
