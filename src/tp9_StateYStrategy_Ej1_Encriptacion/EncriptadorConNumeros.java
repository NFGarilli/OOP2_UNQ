package tp9_StateYStrategy_Ej1_Encriptacion;


public class EncriptadorConNumeros  extends MetodosDeEncriptacion {
	private final Integer neutralizadorDeNumeros = 96;
	private final Integer neutralizadorDeNumerosDeMayusculas = 64;
	

	@Override
	public String encriptarLetra(String letra) {
		
		return ( this.neutralizarCharacterEncriptandolo(letra) + ",");
	}

	@Override
	public String desencriptarLetra(String letra) {
		// TODO Auto-generated method stub
		return ( this.neutralizarCharacterDesencriptandolo(letra) + "");
	}

	@Override
	public String resolver(String texto) {
		
		return this.mensajeGenerico(this, texto);
	}
	
	
	
	
	
	public Character stringToChar(String string) {
		return string.charAt(0);
		
	}

	
	public Integer neutralizarCharacterEncriptandolo(String letra) {
		Integer valorARetornar;
		boolean hasUppercase = letra.equals(letra.toUpperCase());
		Character letraANeutralizar = this.stringToChar(letra);
		if (letra.contains(" ")) {
			valorARetornar = 0;
		} else {
		valorARetornar = (hasUppercase ? (letraANeutralizar - this.neutralizadorDeNumerosDeMayusculas) : letraANeutralizar - this.neutralizadorDeNumeros);
		}
		return valorARetornar;
	}
	
	
	
	
	//Intentamos hacer la desencriptacion, pero al hacerlo letra por letra, si el ASCi a desencriptar era de dos digitos, solo podiamos desencriptar el primero.
	public String neutralizarCharacterDesencriptandolo(String letra) {
		String valorARetornar;
		
		int valor =  this.stringToChar(letra);
		char chara;
		
		if (valor == 32) {
			valorARetornar = " ";
		} else {
			
			//valorARetornar = (valor + this.neutralizadorDeNumeros);
			chara = (char) (valor + this.neutralizadorDeNumeros); 
		
			valorARetornar = Character.toString(chara);
		
		}
		return valorARetornar;
	}
	
	

	
	
	
	
}
