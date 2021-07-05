package tp6_Mockito_Poker;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

	public Carta c1;
	public Carta c2;
	public Carta c3;
	public Carta c4;
	public Carta c5;
	public Jugada jugada1;
	public Jugada jugada2;
	
	PokerStatus pokerStatus;
	
	@BeforeEach
	void setUp() throws Exception {
		
		//Set up
			this.c1  = mock(Carta.class);//new Carta(1,'P');
			this.c2  = mock(Carta.class);//new Carta(1,'C');
			this.c3  = mock(Carta.class);//new Carta(1,'D');
			this.c4  = mock(Carta.class);//new Carta(1,'T');
			this.c5  = mock(Carta.class);//new Carta(6,'C');
			this.jugada1 	= mock(Jugada.class);
			this.jugada2 	= mock(Jugada.class);
			
			this.pokerStatus = new PokerStatus();
			
	}

	@Test
	void test001TestMiManoDe3CartasDeValoresIgualesYEsTrio() {
		
		// 	----SET UP------
		Integer num 	= 10;
		Integer num2 	= 3;
		Integer num3	= 4;
		List<Carta> l1 = new ArrayList<Carta>(Arrays.asList(c1,c2,c3,c4,c5));
		
		// 	----EXCERCISE-----
		when(c1.getValor()).thenReturn(num);
		when(c2.getValor()).thenReturn(num);
		when(c3.getValor()).thenReturn(num);
		when(c4.getValor()).thenReturn(num2);
		when(c5.getValor()).thenReturn(num3);  
		  
		  
		  
		// 	----VERIFY----
		assertTrue(pokerStatus.esTrio(l1));
	}
	
	@Test
	void test002TestMiManoDe0CartasDeValoresIgualesEsNingunaJugada() {
		
		//----SET UP------
		Integer num 	= 10;
		Integer num2 	= 3;
		Integer num3	= 4;
		Integer num4 	= 5;
		Integer num5	= 6;
		List<Carta> l1 = new ArrayList<Carta>(Arrays.asList(c1,c2,c3,c4,c5));
			
		// 	----EXCERCISE-----
		when(c1.getValor()).thenReturn(num);
		when(c2.getValor()).thenReturn(num2);
		when(c3.getValor()).thenReturn(num3);
		when(c4.getValor()).thenReturn(num4);
		when(c5.getValor()).thenReturn(num5);  
		
		when(c1.getPalo()).thenReturn('C');
		when(c2.getPalo()).thenReturn('T');
		when(c3.getPalo()).thenReturn('P');
		when(c4.getPalo()).thenReturn('D');
		when(c5.getPalo()).thenReturn('C');
			  
			  
			 
		//	 ----VERIFY----
		assertTrue(pokerStatus.esNingunaJugada(l1));
	}
	
	@Test
	void test003TestMiManoDe4CartasDeValorIgualNoEsNingunaJugada() {
		
		
		//----SET UP------
		Integer num 	= 10;
		Integer num5	= 6;
		List<Carta> l1 = new ArrayList<Carta>(Arrays.asList(c1,c2,c3,c4,c5));
			
		// 	----EXCERCISE-----
		when(c1.getValor()).thenReturn(num);
		when(c2.getValor()).thenReturn(num);
		when(c3.getValor()).thenReturn(num);
		when(c4.getValor()).thenReturn(num);
		when(c5.getValor()).thenReturn(num5);  
		
		when(c1.getPalo()).thenReturn('C');
		when(c2.getPalo()).thenReturn('T');
		when(c3.getPalo()).thenReturn('P');
		when(c4.getPalo()).thenReturn('D');
		when(c5.getPalo()).thenReturn('C');				 
			
		//	 ----VERIFY----
		assertFalse(pokerStatus.esNingunaJugada(l1));
	}
	
	
	@Test
	void test004TestMiManoDe4CartasConValor14EsPoker() {

		
		//----SET UP------
		Integer num 	= 14;
		Integer num2 	= 13;
		List<Carta> l1 = new ArrayList<Carta>(Arrays.asList(c1,c2,c3,c4,c5));
			
		// 	----EXCERCISE-----
		when(c1.getValor()).thenReturn(num);
		when(c2.getValor()).thenReturn(num);
		when(c3.getValor()).thenReturn(num);
		when(c4.getValor()).thenReturn(num);
		when(c5.getValor()).thenReturn(num2);  		
		
		

		// ----VERIFY----
		assertTrue(pokerStatus.esPoker(l1));
	}
	
	
	@Test
	void test005TestMiManoConColorNoEsTrio() {
		
		// 	----SET UP------
		Integer num 	= 10;
		Integer num2 	= 3;
		Integer num3	= 4;
		List<Carta> l1 = new ArrayList<Carta>(Arrays.asList(c1,c2,c3,c4,c5));
		
		// 	----EXCERCISE-----
		when(c1.getValor()).thenReturn(num);
		when(c2.getValor()).thenReturn(num);
		when(c3.getValor()).thenReturn(num2);
		when(c4.getValor()).thenReturn(num2);
		when(c5.getValor()).thenReturn(num3);  
		  
		  
		  
		// 	----VERIFY----
		assertFalse(pokerStatus.esTrio(l1));
	}
	
	@Test
	void test006TestMiManoConColorNoEsPoker() {
		
		// 	----SET UP------
		Integer num 	= 10;
		Integer num2 	= 3;
		Integer num3	= 4;
		List<Carta> l1 = new ArrayList<Carta>(Arrays.asList(c1,c2,c3,c4,c5));
		
		// 	----EXCERCISE-----
		when(c1.getValor()).thenReturn(num);
		when(c2.getValor()).thenReturn(num);
		when(c3.getValor()).thenReturn(num2);
		when(c4.getValor()).thenReturn(num2);
		when(c5.getValor()).thenReturn(num3);  
		
		when(c1.getPalo()).thenReturn('C');
		when(c2.getPalo()).thenReturn('C');
		when(c3.getPalo()).thenReturn('C');
		when(c4.getPalo()).thenReturn('C');
		when(c5.getPalo()).thenReturn('C');	  
		  
		// 	----VERIFY----
		assertFalse(pokerStatus.esTrio(l1));
	}
	
	@Test
	void test005TestMiManoDe4CartasConValor14EsPoker() {

		
		//----SET UP------
		Integer num 	= 14;
		Integer num2 	= 13;
			
		// 	----EXCERCISE-----
		when(c1.getValor()).thenReturn(num);
		when(c2.getValor()).thenReturn(num);
		when(c3.getValor()).thenReturn(num);
		when(c4.getValor()).thenReturn(num);
		when(c5.getValor()).thenReturn(num2);  		
		
		String jugada = pokerStatus.verify(c1,c2,c3,c4,c5);
		

		// ----VERIFY----
		assertEquals(jugada, "Poker");
	}
	
	@Test
	void test006TestMiManoDe3CartasConValor10EsTrio() {

		//	----SET UP------
		Integer num 	= 10;
		Integer num2 	= 3;
		Integer num3	= 4;
		
		
		// 	----EXCERCISE-----
		when(c1.getValor()).thenReturn(num);
		when(c2.getValor()).thenReturn(num);
		when(c3.getValor()).thenReturn(num);
		when(c4.getValor()).thenReturn(num2);
		when(c5.getValor()).thenReturn(num3);
		
		when(c1.getPalo()).thenReturn('C');
		when(c2.getPalo()).thenReturn('T');
		when(c3.getPalo()).thenReturn('C');
		when(c4.getPalo()).thenReturn('P');
		when(c5.getPalo()).thenReturn('D');
		
		String jugada = pokerStatus.verify(c1,c2,c3,c4,c5);
		

		// ----VERIFY----
		assertEquals(jugada, "Trio");
	}
	
	@Test
	void test006TestMiManoConColorRetornaColor() {
		
		// 	----SET UP------
		Integer num 	= 10;
		Integer num2 	= 3;
		Integer num3	= 4;
	
		
		// 	----EXCERCISE-----
		when(c1.getValor()).thenReturn(num);
		when(c2.getValor()).thenReturn(num);
		when(c3.getValor()).thenReturn(num2);
		when(c4.getValor()).thenReturn(num2);
		when(c5.getValor()).thenReturn(num3);  
		
		when(c1.getPalo()).thenReturn('C');
		when(c2.getPalo()).thenReturn('C');
		when(c3.getPalo()).thenReturn('C');
		when(c4.getPalo()).thenReturn('C');
		when(c5.getPalo()).thenReturn('C');	  
		
		String jugada = pokerStatus.verify(c1,c2,c3,c4,c5);
		  
		// 	----VERIFY----
		assertEquals(jugada, "Color");
	}
	
	@Test
	void test007TestMiPokerStatusComparaLaJugadaUnoConValorPokerYEsMejorQueColor() {
		
		// 	----SET UP------
		Integer num 	= 10;
		Integer num2 	= 3;
		Integer num3	= 4;
		List<Carta> l1 = new ArrayList<Carta>(Arrays.asList(c1,c2,c3,c4,c5));
		
		// 	----EXCERCISE-----
		when(c1.getValor()).thenReturn(num,num);
		when(c2.getValor()).thenReturn(num,num);
		when(c3.getValor()).thenReturn(num,num2);
		when(c4.getValor()).thenReturn(num,num2);
		when(c5.getValor()).thenReturn(num3,num3);  
		
		when(c1.getPalo()).thenReturn('C');
		when(c2.getPalo()).thenReturn('C');
		when(c3.getPalo()).thenReturn('C');
		when(c4.getPalo()).thenReturn('C');
		when(c5.getPalo()).thenReturn('C');	  
		
		when(jugada1.getListaDeCartasJugada()).thenReturn(l1);
		when(jugada2.getListaDeCartasJugada()).thenReturn(l1);
		  
		// 	----VERIFY----
		assertEquals(pokerStatus.jugadaGanadora(jugada1, jugada2), jugada1);
	}
	
	@Test
	void test008TestMiPokerStatusComparaLaJugadaUnoConValorColorYEsMejorQueTrio() {
		
		// 	----SET UP------
		Integer num 	= 10;
		Integer num2 	= 3;
		Integer num3	= 4;
		List<Carta> l1 = new ArrayList<Carta>(Arrays.asList(c1,c2,c3,c4,c5));
		
		// 	----EXCERCISE-----
		when(c1.getValor()).thenReturn(num,num);
		when(c2.getValor()).thenReturn(num,num);
		when(c3.getValor()).thenReturn(num,num2);
		when(c4.getValor()).thenReturn(num2,num2);
		when(c5.getValor()).thenReturn(num3,num3);  
		
		when(c1.getPalo()).thenReturn('T','C');
		when(c2.getPalo()).thenReturn('C','C');
		when(c3.getPalo()).thenReturn('P','C');
		when(c4.getPalo()).thenReturn('D','C');
		when(c5.getPalo()).thenReturn('D','C');	  
		
		when(jugada1.getListaDeCartasJugada()).thenReturn(l1);
		when(jugada2.getListaDeCartasJugada()).thenReturn(l1);
		  
		// 	----VERIFY----
		assertEquals(pokerStatus.jugadaGanadora(jugada1, jugada2), jugada2);
	}    
	
    
	@Test                                                                               
	void test009TestMiManoDe4CartasDeValorIgualNoEsNingunaJugada() {                    
	    
	    
		//----SET UP------                                                              
		Integer num1 	= 1;                                                           
		Integer num2	= 2;
		Integer num3	= 3; 
		Integer num4 	= 4;                                                           
		Integer num5	= 5;
		Integer num6	= 6; 
		List<Carta> l1 = new ArrayList<Carta>(Arrays.asList(c1,c2,c3,c4,c5));           
		    
		// 	----EXCERCISE-----                                                          
		when(c1.getValor()).thenReturn(num1,num4);                                            
		when(c2.getValor()).thenReturn(num2,num5);                                            
		when(c3.getValor()).thenReturn(num3,num6);                                            
		when(c4.getValor()).thenReturn(num1,num4);                                            
		when(c5.getValor()).thenReturn(num2,num5);                                           
		    
		when(c1.getPalo()).thenReturn('C');                                             
		when(c2.getPalo()).thenReturn('T');                                             
		when(c3.getPalo()).thenReturn('P');                                             
		when(c4.getPalo()).thenReturn('D');                                             
		when(c5.getPalo()).thenReturn('C');
		
		when(jugada1.getListaDeCartasJugada()).thenReturn(l1);
		when(jugada2.getListaDeCartasJugada()).thenReturn(l1);
		    
		//	 ----VERIFY----                                                             
		assertEquals(pokerStatus.jugadaGanadora(jugada1, jugada2), jugada2);                                   
		                                                                                   
	    
		
	}
	
}
	

