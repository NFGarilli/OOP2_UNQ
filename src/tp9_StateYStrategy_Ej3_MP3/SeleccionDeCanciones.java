package tp9_StateYStrategy_Ej3_MP3;

public class SeleccionDeCanciones extends EstadoDeReproduccion {

	@Override
	public void reproducirPara(ReproductorMP3 reproductor, Song cancion) {
		reproductor.reproducir(cancion);
		reproductor.setEstado(new Play());
	}

	@Override
	public void stopearPara(ReproductorMP3 reproductor) {
		//No realiza nada debido a que si esta en estado Seleccion de Canciones, no tiene ninguna cancion reproduciendo
		
	}

	@Override
	public void pausarPara(ReproductorMP3 reproductor) {
		//No realiza nada debido a que si esta en estado Seleccion de Canciones, no tiene ninguna cancion reproduciendo
		
	}
	
	
	
}
