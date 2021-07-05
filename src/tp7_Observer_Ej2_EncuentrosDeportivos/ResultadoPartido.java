package tp7_Observer_Ej2_EncuentrosDeportivos;

import java.util.List;

public class ResultadoPartido {

	private String 			resultado;
	private List<String> 	contrincantes;
	private String 			deporte;
	
	public String getResultado() {
		return resultado;
	}

	public List<String> getContrincantes() {
		return contrincantes;
	}

	public String getDeporte() {
		return deporte;
	}

	public ResultadoPartido(String resultado, List<String>contrincantes, String deporte) {
		this.resultado 		= resultado;
		this.contrincantes	= contrincantes;
		this.deporte 		= deporte;
	}
	
}
