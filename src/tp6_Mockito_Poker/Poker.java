package tp6_Mockito_Poker;

import java.util.List;

public class Poker extends EstadoDeJugada{
	
	public Poker() {
		this.jugada = "Poker";
	}

	@Override
	public String identificarJugada(List<Carta> listaDeCartas, PokerStatus pokerStatus) {
		String retornoJugada = this.jugada;
		
		if(!pokerStatus.esPoker(listaDeCartas)){
			retornoJugada = new Color().identificarJugada(listaDeCartas, pokerStatus);	
		}
		
		pokerStatus.setEstado(this);
		return retornoJugada;	
	}

	
	
	
	
	
}
