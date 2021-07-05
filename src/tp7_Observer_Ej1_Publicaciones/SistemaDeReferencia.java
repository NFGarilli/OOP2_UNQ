package tp7_Observer_Ej1_Publicaciones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SistemaDeReferencia{
	
	private List<IGeneroDeTexto> listaDeArticulos;
	private List<Observer> interesadosANotificar;
	
	public SistemaDeReferencia() {
		this.listaDeArticulos		= new ArrayList<IGeneroDeTexto>();
		this.interesadosANotificar 	= new ArrayList<Observer>();
	}
	
	public void registrarArticulo(IGeneroDeTexto articulo) {
		listaDeArticulos.add(articulo);
		this.notificar(articulo);
			
	}
	
	public void agregarInteresado(Observer interesado) {
		this.interesadosANotificar.add(interesado);
	}
	
	private void notificar(IGeneroDeTexto articulo) {
		String tipoDeArticulo = articulo.getGenero();
		List<Observer> listaDeInteresadosSobreArticuloActual = this.listaDeInteresadosSobreTipoDeGenero(tipoDeArticulo);
		
		listaDeInteresadosSobreArticuloActual.stream().forEach(interesado -> interesado.avisarPorArticulo(articulo));
	}

	private List<Observer> listaDeInteresadosSobreTipoDeGenero(String tipoDeArticulo) {
		return this.interesadosANotificar.stream().filter(interesado -> interesado.estaInteresadoEn(tipoDeArticulo)).collect(Collectors.toList());
	}
	
	
	
	
}
