package tp7_Observer_Ej1_Publicaciones;

import java.util.ArrayList;
import java.util.List;

public class Investigador implements Observer{

	List<String> generosInteresados;
	
	public Investigador() {
		this.generosInteresados = new ArrayList<String>();
	}
	@Override
	public String avisarPorArticulo(IGeneroDeTexto articulo) {
		return "CAPO, SE HUBO UNA PUBLICACION DE TU INCUMBENCIA: " + articulo.getTitulo() + "POR EL GENERO: " + articulo.getGenero(); 
		
	}

	@Override
	public Boolean estaInteresadoEn(String tipoDeArticulo) {
		return generosInteresados.contains(tipoDeArticulo);
	}
	
	public void agregarGeneroInteresado(String genero) {
		this.generosInteresados.add(genero);
	}
	
	public void sacarGeneroInteresado(String genero) {
		this.generosInteresados.remove(genero);
	}

}
