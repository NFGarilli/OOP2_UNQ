package tp7_Observer_Ej3_SistemaDePreguntas;

import java.util.Map;

public class Pregunta {
	private Integer respuestaSeleccionada;
	private Integer	respuestaCorrecta;
	private String 	pregunta;
	private Map<Integer, String> opciones;
	
	public Pregunta(Integer respuestaCorrecta, String pregunta, Map<Integer, String> opciones) {
		this.respuestaCorrecta 	= respuestaCorrecta;
		this.pregunta 			= pregunta;
		this.opciones 			= opciones; 
	}
	public void seleccionarRespuesta(Integer respuesta) {
		this.respuestaSeleccionada = respuesta;
	}
	public boolean respuestaCorrecta() {
		return this.respuestaSeleccionada.equals(this.respuestaSeleccionada);
	}
	
	

}
