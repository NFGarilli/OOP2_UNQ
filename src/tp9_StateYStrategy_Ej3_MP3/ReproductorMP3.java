package tp9_StateYStrategy_Ej3_MP3;

public class ReproductorMP3 {
	
	Song cancionActual;
	EstadoDeReproduccion estadoActual;
	
	public ReproductorMP3() {
		this.estadoActual = new SeleccionDeCanciones();
	}
	
	public void play(Song cancion) {
		this.estadoActual.reproducirPara(this,cancion);
	}
	
	public void stop() {
		this.estadoActual.stopearPara(this);
	}

	public void pause() {
		this.estadoActual.pausarPara(this);
	}

	public void reproducir(Song cancion) {
		this.cancionActual = cancion;
		this.cancionActual.play();
	}

	public void setEstado(EstadoDeReproduccion estado) {
		this.estadoActual = estado;
	}

	public void pausarCancion() {
		this.cancionActual.pause();
		
	}
	
	public void reproducirCancion() {
		this.cancionActual.play();
	}

	public void stopearCancionActual() {
		this.cancionActual.stop();
	}
	
	
	
	
	
	
	
}
