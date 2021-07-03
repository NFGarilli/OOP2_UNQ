package tp7_Composite_Ej3_Warcraft;

import java.util.ArrayList;
import java.util.List;

public class Ejercito implements IPersonaje {
	List<IPersonaje> listaDePersonajes;
	
	
	public Ejercito(List<IPersonaje> listaDePersonajes) {
		super();
		this.listaDePersonajes = new ArrayList<IPersonaje>();		
	}


	@Override
	public void caminar(Punto punto) {		
		listaDePersonajes.stream().forEach(p -> p.caminar(punto)); //Cada pj de mi lista implementa su forma de caminar;
		
		
	}
	

	public IPersonaje obtenerSoldado(int posicionSoldado) {
		return this.listaDePersonajes.get(posicionSoldado);
	}

	public void quitarSoldado(IPersonaje personaje) {
		this.listaDePersonajes.remove(personaje);
	}
	
	public void agregarSoldado(IPersonaje personaje) {
		this.listaDePersonajes.add(personaje);
	}
	
	public List<IPersonaje> getSoldados() {
		return listaDePersonajes;
	}

}
