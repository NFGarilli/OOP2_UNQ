package tp6_Mockito_Poker;

import java.util.List;

public class Color extends EstadoDeJugada {

	public Color() {
		this.jugada = "Color";
	}
	@Override
	public String identificarJugada(List<Carta> listaDeCartas, PokerStatus pokerStatus) {
		
		String retornoJugada = this.jugada;
		
		if(!pokerStatus.esColor(listaDeCartas)){
			retornoJugada = new Trio().identificarJugada(listaDeCartas, pokerStatus);	
		}
		return retornoJugada;
	}
	

}
