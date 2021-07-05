package tp6_Mockito_Poker;

import java.util.List;

public class NingunaJugada extends EstadoDeJugada {
	
	
	public NingunaJugada() {
		this.jugada = "Nada";
	}


	@Override
	public String identificarJugada(List<Carta> listaDeCartas, PokerStatus pokerStatus) {
		return this.jugada;
	}	
	
}
