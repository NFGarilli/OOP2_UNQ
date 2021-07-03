package tp9_StateYStrategy_Ej2_VideoJuegos;

public class SinFichas extends EstadosDeMaquinaDeVideoJuegos {

	@Override
	public void iniciarJuegoPara(MaquinaDeVideoJuegos maquina) {
		maquina.pedirQueIngresenFichasParaIniciar();
		
	}

	@Override
	protected void pasarAlSiguienteEstado(MaquinaDeVideoJuegos maquinaDeVideoJuegos) {
		maquinaDeVideoJuegos.cambiarEstadoActual(new UnJugador());
	}

	@Override
	protected void pasarAlAnteriorEstado(MaquinaDeVideoJuegos maquinaDeVideoJuegos) {
		// TODO Auto-generated method stub
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
