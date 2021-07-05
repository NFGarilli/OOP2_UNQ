package tp7_Observer_Ej3_SistemaDePreguntas;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

public class SistemaDePreguntas implements Observable {
	List<Pregunta> preguntas;
	Map<Observer, Integer> participantes;
	
	public SistemaDePreguntas(List<Pregunta>preguntas) {
		this.preguntas		= 	preguntas;
		this.participantes	=	new HashMap<Observer, Integer>();
	}
	
	public SistemaDePreguntas() {
		this.preguntas 		= new ArrayList<Pregunta>();
		this.participantes	= new HashMap<Observer, Integer>();
	}
	
	public void solicitarParticipacion(Observer participante) {
		if(participantes.size() < 5) {
			this.participantes.put(participante, 0);
			List<Pregunta> cincoPreguntas = this.devolverNPreguntas(5);
			participante.update(cincoPreguntas, this);
		}
		
		
	}
	
	private List<Pregunta> devolverNPreguntas(int cantidadDePreguntas){
		List<Pregunta> cincoPreguntas = new ArrayList<Pregunta>();
		Random rand = new Random();
		int randomIndex;
		for (int i = 0; i < cantidadDePreguntas; i++){
			randomIndex = rand.nextInt(this.preguntas.size());
			cincoPreguntas.add(this.preguntas.get(randomIndex));
		}
		return cincoPreguntas;
	}

	@Override
	public void recibirRespuesta(Observer participante, Pregunta pregunta) {
		int valueDeParticipante = this.participantes.get(participante);
		
		if(pregunta.respuestaCorrecta()) {
			this.participantes.put(participante, valueDeParticipante + 1);
			participante.respondioCorrectamente();
		}else {
			participante.respondioIncorrectamente();
		}
		
	}
	
	
	
}
