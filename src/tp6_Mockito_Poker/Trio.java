package tp6_Mockito_Poker;

import java.util.List;

public class Trio extends EstadoDeJugada {

	public Trio() {
		this.jugada = "Trio";
	}
	
	@Override
	public String identificarJugada(List<Carta> listaDeCartas, PokerStatus pokerStatus) {
		String retornoJugada = this.jugada;
		
		if(!pokerStatus.esTrio(listaDeCartas)){
			retornoJugada = new NingunaJugada().identificarJugada(listaDeCartas, pokerStatus);	
		}
		return retornoJugada;
	}

	

}
