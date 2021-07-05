package tp6_Mockito_Poker;

import java.util.ArrayList;
import java.util.List;

public abstract class EstadoDeJugada {
	protected String jugada;
	
	public abstract String identificarJugada(List<Carta> listaDeCartas, PokerStatus pokerStatus);
	
	public List<Integer> valoresDeCartas(List<Carta> listaDeCartas){
		List<Integer> listaDeValores = new ArrayList<Integer>();
		listaDeCartas.stream().forEach(carta -> listaDeValores.add(carta.getValor()));
		return listaDeValores;
	}
	
	public List<Character> palosDeCartas(List<Carta> listaDeCartas){
		List<Character> listaDePalos = new ArrayList<Character>();
		listaDeCartas.stream().forEach(carta -> listaDePalos.add(carta.getPalo()));
		return listaDePalos;
	}
	
	
	
}
