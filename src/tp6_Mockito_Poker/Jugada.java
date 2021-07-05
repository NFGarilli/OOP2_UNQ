package tp6_Mockito_Poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Jugada {

	List<Carta> cartas; 
	
	public Jugada(Carta c1, Carta c2, Carta c3, Carta c4, Carta c5) {
		cartas = new ArrayList<Carta> (Arrays.asList(c1,c2,c3,c4,c5));
		
	}
	
	
	public Integer getValorJugada() {
		return cartas.stream().mapToInt(carta -> carta.getValor()).sum();
	}

	public Boolean leGanaA(Jugada jugada2) {
		
		return this.getValorJugada() > jugada2.getValorJugada();
	}
	
	public List<Carta> getListaDeCartasJugada(){
		return this.cartas;
	}
}
