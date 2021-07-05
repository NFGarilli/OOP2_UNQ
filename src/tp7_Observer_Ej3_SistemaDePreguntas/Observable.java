package tp7_Observer_Ej3_SistemaDePreguntas;

public interface Observable {
	public void solicitarParticipacion(Observer participante);

	public void recibirRespuesta(Observer participante, Pregunta pregunta);
}
