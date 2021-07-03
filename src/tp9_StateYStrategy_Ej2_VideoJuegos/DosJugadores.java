package tp9_StateYStrategy_Ej2_VideoJuegos;

public class DosJugadores extends EstadosDeMaquinaDeVideoJuegos {
	
	@Override
	public void iniciarJuegoPara(MaquinaDeVideoJuegos maquina) {
		// TODO Auto-generated method stub
		maquina.iniciarJuegoParaDosJugador();
		maquina.consumirFicha();
		maquina.consumirFicha();
		
	}
	
	public boolean laMaquinaTieneSuficientesFichas(MaquinaDeVideoJuegos maquina) {
		return (maquina.getFichas() >= 2);
	}


	@Override
	protected void pasarAlSiguienteEstado(MaquinaDeVideoJuegos maquinaDeVideoJuegos) {
		
	}

	@Override
	protected void pasarAlAnteriorEstado(MaquinaDeVideoJuegos maquinaDeVideoJuegos) {
		if (!this.laMaquinaTieneSuficientesFichas(maquinaDeVideoJuegos)) {
			maquinaDeVideoJuegos.cambiarEstadoActual(new UnJugador());
		}
	}

}
