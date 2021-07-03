package tp8_TemplateMethodYAdapter_Ej3_ElementosSimilares;

public class FiltroLetraInicial extends Filtro {

	@Override
	public boolean pasarFiltro(WikipediaPage page, WikipediaPage pagAFiltrar) {
		
		char primeraLetraDelTitulo = page.getTitle().charAt(0);
		char primeraLetraDelTituloAFiltrar = pagAFiltrar.getTitle().charAt(0);
		
		return primeraLetraDelTitulo == primeraLetraDelTituloAFiltrar;
	}
	
}