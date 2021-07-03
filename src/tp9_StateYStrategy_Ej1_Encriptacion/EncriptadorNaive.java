package tp9_StateYStrategy_Ej1_Encriptacion;

public class EncriptadorNaive {
	MetodosDeEncriptacion metodoDeEncriptacionActual;
	
	public EncriptadorNaive(MetodosDeEncriptacion metodoDeEncriptacionActual) {
		super();
		this.metodoDeEncriptacionActual = metodoDeEncriptacionActual;
		
	}

	
	public String encriptar(String texto) {				
		metodoDeEncriptacionActual.tuEstadoEsEncriptacion();
		return metodoDeEncriptacionActual.resolver(texto);	
	}
		
	
	public String desencriptar(String texto) {
		metodoDeEncriptacionActual.tuEstadoEsDesencriptacion();
		return metodoDeEncriptacionActual.resolver(texto);
	}
	
	
	public void cambiarMetodoDeEncriptacionActual(MetodosDeEncriptacion metodoDeEncriptacionActual) {
		this.metodoDeEncriptacionActual = metodoDeEncriptacionActual;
	}
	
	
	
	

}
