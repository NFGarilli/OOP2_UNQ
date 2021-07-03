package tp9_StateYStrategy_Ej1_Encriptacion;

public class Desencriptar extends EstadoDeEncriptacion {
	
	
	@Override
	public String resolverEncriptacion(MetodosDeEncriptacion encriptador, String texto) {
		return encriptador.desencriptarLetra(texto);
	}
}
