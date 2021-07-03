package tp9_StateYStrategy_Ej1_Encriptacion;


public class EncriptadorDeVocales extends MetodosDeEncriptacion {
	
	
	@Override
	public String resolver(String texto) {
		return this.mensajeGenerico(this, texto);
	}
		
	
	@Override
	  public String encriptarLetra(String letra) {
	switch (letra) {	
		case "a": 
			return "e";
		case "e":
			return "i";
		case "i":
			return "o";
		case "o":
			return "u";
		case "u":
			return "a";
		default:
			return letra;
		}
	}

	
	@Override
	public String desencriptarLetra(String letra) {
		switch (letra) {	
		case "a": 
			return "u";
		case "e":
			return "a";
		case "i":
			return "e";
		case "o":
			return "i";
		case "u":
			return "o";
		default:
			return letra;
		}
	}
	

}
