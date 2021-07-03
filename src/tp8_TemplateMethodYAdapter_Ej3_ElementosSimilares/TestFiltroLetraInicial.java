package tp8_TemplateMethodYAdapter_Ej3_ElementosSimilares;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFiltroLetraInicial  {

	WikiPage 				wikiPag1;
	WikiPage 				wikiPag2;
	WikiPage 				wikiPag3;
	WikiPage 				wikiPag4;
	FiltroLetraInicial 		filtroLetraInicial;


	@BeforeEach
	void setUp() throws Exception {
		wikiPag1 = mock(WikiPage.class);
		wikiPag2 = mock(WikiPage.class);
		wikiPag3 = mock(WikiPage.class);
		wikiPag4 = mock(WikiPage.class);
		filtroLetraInicial = new FiltroLetraInicial();
	}

	@Test
	void test001FiltroPorLetraInicialSiLePasoUnaListaVaciaNoCoincideNingunaPagina() {
				
		ArrayList<WikipediaPage> wikiVacia = new ArrayList<WikipediaPage>();
		
	
		assertEquals(0, filtroLetraInicial.getSimilarPages(wikiPag1, wikiVacia).size());
	}
	
	@Test
	void test002FiltroPorLetraInicialSabeLasPaginasQueCoincidenConLaPrimerLetra() {
		
		when(wikiPag1.getTitle()).thenReturn("Miley Cyrus");
		when(wikiPag2.getTitle()).thenReturn("Lali Esposito");
		when(wikiPag3.getTitle()).thenReturn("Martina Stoessel");
		when(wikiPag4.getTitle()).thenReturn("Mirta Legrand");
		
		ArrayList<WikipediaPage> wikipedia = new ArrayList<>(Arrays.asList(wikiPag1, wikiPag2, wikiPag3, wikiPag4));
		
		assertEquals(3, filtroLetraInicial.getSimilarPages(wikiPag1, wikipedia).size());
		
	}

	
	
}
