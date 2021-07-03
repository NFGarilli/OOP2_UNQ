package tp9_StateYStrategy_Ej2_VideoJuegos;

public class MaquinaDeVideoJuegos {
	private EstadosDeMaquinaDeVideoJuegos estadoActual;
	private Integer fichas;
	
	
	public MaquinaDeVideoJuegos() {
		super();
		estadoActual = new SinFichas();
		fichas = 0;		
	}
	
	public void iniciarJuego() {
		this.estadoActual.iniciarJuegoPara(this);
	}
	
	public void iniciarJuegoParaUnJugador() {
		//Inicia el juego para un jugador.
	}
	
	public void iniciarJuegoParaDosJugador() {
		//Inicia el juego para Dos jugadores.
	}
	
	public void pedirQueIngresenFichasParaIniciar() {
		//No tengo fichas por lo tanto genero un cartel que pida que ingresen fichas para iniciar.
		System.out.println("Ingrese fichas para iniciar el juego de JAVASTA");
	}
	
	
	public void cambiarEstadoActual(EstadosDeMaquinaDeVideoJuegos estadoActual) {
		this.estadoActual = estadoActual;
	}



	public Integer getFichas() {
		return fichas;
	}


	public void agregarFichas() {
		this.fichas ++;
		this.estadoActual.pasarAlSiguienteEstado(this);
	}

	public void consumirFicha() {
		this.fichas --;
		this.estadoActual.pasarAlAnteriorEstado(this);

		
	}

	

	
}



