package tp9_StateYStrategy_Ej3_MP3;

public class Play extends EstadoDeReproduccion {

	@Override
	public void reproducirPara(ReproductorMP3 reproductor, Song cancion) {
		//Ya esta reproduciendo, no puede reproducir otra cancion
		
	}

	@Override
	public void stopearPara(ReproductorMP3 reproductor) {
		reproductor.stopearCancionActual();
		reproductor.setEstado(new SeleccionDeCanciones());

	}

	@Override
	public void pausarPara(ReproductorMP3 reproductor) {
		reproductor.pausarCancion();
		reproductor.setEstado(new Pause());
	}

}
