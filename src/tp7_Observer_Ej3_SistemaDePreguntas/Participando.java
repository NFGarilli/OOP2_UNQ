package tp7_Observer_Ej3_SistemaDePreguntas;

public class Participando extends EstadoDeParticipacion {

	@Override
	public void responder(Pregunta pregunta, int respuesta, Participante participante) {
		pregunta.seleccionarRespuesta(respuesta);
		participante.enviarRespuesta(pregunta);
	}

}
