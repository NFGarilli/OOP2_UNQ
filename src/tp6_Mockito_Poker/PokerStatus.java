package tp6_Mockito_Poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class PokerStatus {
	
	EstadoDeJugada estadoInicial;
	
	//Constructor
	public PokerStatus() {
		super();
		estadoInicial = new Poker();
	}
	
	
	
	//Metodos
	public String verify(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		List<Carta> listaDeCartas = new ArrayList<Carta> (Arrays.asList(carta1, carta2, carta3, carta4, carta5));
		
		String jugada = this.estadoInicial.identificarJugada(listaDeCartas, this);
		return jugada;
	}

	public boolean esTrio(List<Carta> listaDeCartas) {
		return listaDeCartas.stream().anyMatch(carta -> this.esJugada(carta, listaDeCartas, 3));
	}
	
	public boolean esPoker(List<Carta> listaDeCartas) {
		return listaDeCartas.stream().anyMatch(carta -> this.esJugada(carta, listaDeCartas, 4));
	}
	
	public Boolean esColor(List<Carta> listaDeCartas) {
		List<Character> listaDePalos = new ArrayList<Character>();
		listaDeCartas.stream().forEach(carta -> listaDePalos.add(carta.getPalo()));
			      return listaDePalos.stream()
			    		  			.distinct()
			    		  			.count() <= 1;
	}
	
	public Boolean esNingunaJugada(List<Carta> l1) {
		return (!(this.esPoker(l1)) && !(this.esColor(l1)) && !(this.esTrio(l1)));
	}
	
	//Metodos Privados
	private Boolean esJugada(Carta cartaAChekear, List<Carta> listaDeCartas, int cantidadDeCartasIguales) {
		
		List<Carta> listaDeValoresCoincidentes = listaDeCartas.stream().filter(carta -> (carta.getValor()).equals(cartaAChekear.getValor())).collect(Collectors.toList());
		return listaDeValoresCoincidentes.size() >= cantidadDeCartasIguales;
	}
	
	
	public void setEstado(EstadoDeJugada estado) {
		this.estadoInicial = estado;
	}

	public Jugada jugadaGanadora(Jugada jugada1, Jugada jugada2) {
		
		List<Carta> cartasJugada1 = jugada1.getListaDeCartasJugada();
		List<Carta> cartasJugada2 = jugada2.getListaDeCartasJugada();
		
		String manoDeJugada1 = this.verify(cartasJugada1.get(0),cartasJugada1.get(1),cartasJugada1.get(2),cartasJugada1.get(3),cartasJugada1.get(4));
		String manoDeJugada2 = this.verify(cartasJugada2.get(0),cartasJugada2.get(1),cartasJugada2.get(2),cartasJugada2.get(3),cartasJugada2.get(4));
		
		
		return (this.compararJugadas(jugada1, manoDeJugada1, jugada2, manoDeJugada2));
		
	}



	private Jugada compararJugadas(Jugada jugada1, String manoDeJugada1, Jugada jugada2, String manoDeJugada2) {
		
		Jugada jugadaARetornar;
		
		if(manoDeJugada1.equals(manoDeJugada2)) {
			jugadaARetornar = this.compararPorValor(jugada1, jugada2);
		}else if (manoDeJugada1.equals("Poker")) {
			jugadaARetornar = jugada1;
		} else if (manoDeJugada1.equals("Color") && !(manoDeJugada2.equals("Poker"))) {
			jugadaARetornar = jugada1;
		} else if (manoDeJugada1.equals("Trio") && manoDeJugada2.equals("Nada")) {
			jugadaARetornar = jugada1;
		} else {
			jugadaARetornar = jugada2;
		}
		
		return jugadaARetornar;
	}



	private Jugada compararPorValor(Jugada jugada1, Jugada jugada2) {
		
		Jugada jugadaARetornar = jugada2;
		
		if(jugada1.leGanaA(jugada2)) {
			jugadaARetornar = jugada1;
		}
		return jugadaARetornar;
		
	}



	
	
	
	
}
