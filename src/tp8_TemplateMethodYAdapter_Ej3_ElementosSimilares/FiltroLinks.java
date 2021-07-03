package tp8_TemplateMethodYAdapter_Ej3_ElementosSimilares;

public class FiltroLinks extends Filtro {

	@Override
	public boolean pasarFiltro(WikipediaPage page, WikipediaPage pagAFiltrar) {
		
		return (page.getLinks().stream().anyMatch(link -> pagAFiltrar.getLinks().contains(link)));
			
		}
	
}


