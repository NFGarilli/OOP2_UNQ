package tp9_StateYStrategy_Ej1_Encriptacion;



public class Encriptar extends EstadoDeEncriptacion {

	@Override
	public String resolverEncriptacion(MetodosDeEncriptacion encriptador, String texto) {
		return encriptador.encriptarLetra(texto);
	}

}
