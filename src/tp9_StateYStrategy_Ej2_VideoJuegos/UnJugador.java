package tp9_StateYStrategy_Ej2_VideoJuegos;

public class UnJugador extends EstadosDeMaquinaDeVideoJuegos {

	@Override
	public void iniciarJuegoPara(MaquinaDeVideoJuegos maquina) {
			maquina.iniciarJuegoParaUnJugador();
			maquina.consumirFicha();
	}

	@Override
	protected void pasarAlSiguienteEstado(MaquinaDeVideoJuegos maquinaDeVideoJuegos) {
		maquinaDeVideoJuegos.cambiarEstadoActual(new DosJugadores());
		
	}

	@Override
	protected void pasarAlAnteriorEstado(MaquinaDeVideoJuegos maquinaDeVideoJuegos) {
		maquinaDeVideoJuegos.cambiarEstadoActual(new SinFichas());
	}

}
