package tp7_Observer_Ej3_SistemaDePreguntas;

import java.util.List;

public class Participante implements Observer {

	private EstadoDeParticipacion 	estado;
	private List<Pregunta>			preguntas;
	private Observable 				sistemaDePregunta;
	
	public Participante() {
		this.estado = new SinParticipar();
	}
	
	@Override
	public void update(List<Pregunta> preguntas, Observable sistemaDePreguntas) {
		this.preguntas			=	preguntas;
		this.sistemaDePregunta	=	sistemaDePreguntas;
		this.estado				=	new Participando();	
	}

	public void responderPregunta(Pregunta pregunta, Integer respuesta) {
		this.estado.responder(pregunta, respuesta,this);
	}
	
	public void enviarRespuesta(Pregunta pregunta) {
		sistemaDePregunta.recibirRespuesta(this, pregunta);
	}
	
	public List<Pregunta> getPreguntas(){
		return this.preguntas;
	}

	@Override
	public void respondioCorrectamente() {
		//NI IDEA
		
	}

	@Override
	public void respondioIncorrectamente() {
		//NI IDEA
		
	}


}
