package tp8_TemplateMethodYAdapter_Ej3_ElementosSimilares;

import java.util.List;
import java.util.stream.Collectors;

	
public abstract class Filtro {

	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		
		return wikipedia.stream().filter(pagAFiltrar -> this.pasarFiltro(page, pagAFiltrar)).collect(Collectors.toList());
		
	}

		
	public abstract boolean pasarFiltro(WikipediaPage page, WikipediaPage pagAFiltrar);
		
}

