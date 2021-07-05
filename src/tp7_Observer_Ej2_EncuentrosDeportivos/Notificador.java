package tp7_Observer_Ej2_EncuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class Notificador {
	
	List<ResultadoPartido> partidos;
	List<IListener> listeners;
	
	public Notificador() {
		this.partidos 	= new ArrayList<ResultadoPartido>();
		this.listeners	= new ArrayList<IListener>();
	}
	
	public void agregarPartido(ResultadoPartido partido) {
		partidos.add(partido);
		this.notify(partido);
	}
	
	public void notify(ResultadoPartido partido) {
		this.listeners.stream().filter(listener -> listener.estaInteresado(partido));
	}
	
	
	
}






