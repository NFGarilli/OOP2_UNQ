package tp9_StateYStrategy_Ej3_MP3;

public class Pause extends EstadoDeReproduccion {

	@Override
	public void reproducirPara(ReproductorMP3 reproductor, Song cancion) {
		// No sabe reproducir debido a que esta en estado pause
		
	}

	@Override
	public void stopearPara(ReproductorMP3 reproductor){
		reproductor.stopearCancionActual();
		reproductor.setEstado(new SeleccionDeCanciones());
		
	}

	@Override
	public void pausarPara(ReproductorMP3 reproductor) {
		reproductor.reproducirCancion();
		reproductor.setEstado(new Play());
	}

}
