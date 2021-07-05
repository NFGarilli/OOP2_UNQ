package tp6_Mockito_Poker;


public class Carta {
	
	private Character 	palo;
	private Integer	 	valor;
	
	public Carta(Integer num, Character palo) {
		super();
		this.palo 	= palo;
		this.valor 	= num;
	}

	public Carta(String valor, char palo) throws Exception {
			this.valor 	= this.pasarAValorNumerico(valor);
		
		
		this.palo 	= palo;
	}

	private Integer pasarAValorNumerico(String valor) throws Exception {
		switch(valor){
		case "J":
			return 11;
		case "Q":
			return 12;
		case "K":
			return 13;
		case "A":
			return 14;
		default:
			throw new Exception("La carta ingresada no es Valida, pone otra carta mal y vas a verte con el equipo de javasta papa gato" + valor);
	}
		
		
	}

	public Character getPalo() {
		return palo;
	}

	public Integer getValor() {
		return valor;
	}

	public Boolean esMayor(Carta c4) {
		return (this.valor) > c4.getValor();
	}

	public Boolean esDeMismoPalo(Carta carta) {
		return this.palo.equals(carta.getPalo());
	}
	
	
	
	
}
