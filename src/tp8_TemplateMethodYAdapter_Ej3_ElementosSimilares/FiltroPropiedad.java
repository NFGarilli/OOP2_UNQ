package tp8_TemplateMethodYAdapter_Ej3_ElementosSimilares;



public class FiltroPropiedad extends Filtro {

	@Override
	public boolean pasarFiltro(WikipediaPage page, WikipediaPage pagAFiltrar) {
		
		return (page.getInfobox().keySet().stream().anyMatch(key -> pagAFiltrar.getInfobox().keySet().contains(key)));
	}
	


}
