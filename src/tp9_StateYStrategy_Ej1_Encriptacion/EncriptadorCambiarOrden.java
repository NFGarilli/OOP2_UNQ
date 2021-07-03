package tp9_StateYStrategy_Ej1_Encriptacion;



public class EncriptadorCambiarOrden  extends MetodosDeEncriptacion {

	@Override
	public String encriptarLetra(String letra) {
		// TODO Auto-generated method stub
		return this.mensajeGenerico(this, letra);
	}

	@Override
	public String desencriptarLetra(String texto) {
		// TODO Auto-generated method stub
		return this.mensajeGenerico(this, texto);
	}


	@Override
	public String resolver(String texto) {
		return this.mensajeGenerico(this, texto);
	}
	
	@Override
	public String mensajeGenerico(MetodosDeEncriptacion encriptador, String texto) {
		String textoEncriptado;
		StringBuilder sb = new StringBuilder(texto);
	
		textoEncriptado = sb.reverse().toString();

		return textoEncriptado;
		}
		
	}


