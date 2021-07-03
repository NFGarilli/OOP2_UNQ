package tp9_StateYStrategy_Ej2_VideoJuegos;

public abstract class EstadosDeMaquinaDeVideoJuegos  {

	
	
	public abstract void iniciarJuegoPara(MaquinaDeVideoJuegos maquina);

	protected abstract void pasarAlSiguienteEstado(MaquinaDeVideoJuegos maquinaDeVideoJuegos);

	protected abstract void pasarAlAnteriorEstado(MaquinaDeVideoJuegos maquinaDeVideoJuegos);

}
