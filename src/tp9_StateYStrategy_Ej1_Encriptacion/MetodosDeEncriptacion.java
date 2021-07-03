package tp9_StateYStrategy_Ej1_Encriptacion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class MetodosDeEncriptacion {
	EstadoDeEncriptacion estadoActual;
	
	
	public String mensajeGenerico(MetodosDeEncriptacion encriptador, String texto) {
	String textoEncriptado;
		
	List<String> textoARecorrer = Arrays.asList(texto.split(""));
	List<String> listaADevolver = new ArrayList<String>();
	textoARecorrer.stream().forEach(letra -> listaADevolver.add(encriptador.resolverLetra(encriptador, letra)));
	textoEncriptado = this.convertirListaEnString(listaADevolver);
	
	return textoEncriptado;
	}
	
	
	protected String convertirListaEnString(List<String> lista) {
		String stringActual = "";
		
		for (String letra : lista) {
			stringActual += letra;
		}
		return stringActual;
	}
	
	public void tuEstadoEsEncriptacion() {
		this.estadoActual = new Encriptar();	
	}
	
	public void tuEstadoEsDesencriptacion() {
		this.estadoActual = new Desencriptar();	
	}
	
	
	public String resolverLetra(MetodosDeEncriptacion encriptador, String texto) {
		return encriptador.estadoActual.resolverEncriptacion(encriptador, texto);
	}
	

	public abstract String encriptarLetra(String letra);
	
	
	public abstract String desencriptarLetra(String texto);
	
	public abstract String resolver(String texto);
	
}



