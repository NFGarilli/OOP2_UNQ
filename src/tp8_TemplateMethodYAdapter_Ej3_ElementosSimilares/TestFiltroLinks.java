package tp8_TemplateMethodYAdapter_Ej3_ElementosSimilares;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFiltroLinks {


	WikiPage 				wikiPag1;
	WikiPage 				wikiPag2;
	WikiPage 				wikiPag3;
	WikiPage 				wikiPag4;
	FiltroLinks 			filtroLinks;

	@BeforeEach
	void setUp() throws Exception {
		wikiPag1 = mock(WikiPage.class);
		wikiPag2 = mock(WikiPage.class);
		wikiPag3 = mock(WikiPage.class);
		wikiPag4 = mock(WikiPage.class);
		filtroLinks = new FiltroLinks();
	}

	@Test
	void test001FiltroLinksSiLePasoUnaUnaWikipediaVaciaNoExistenPaginasQueCoincidan() {
		ArrayList<WikipediaPage> wikiVacia = new ArrayList<WikipediaPage>();
	
		assertEquals(0, filtroLinks.getSimilarPages(wikiPag1, wikiVacia).size());
	}
	
	@Test
	void test002FiltroLinksSabeLaCantidadDePaginasQueCoincidenSegunSusLinks() {
		
		when(wikiPag1.getLinks()).thenReturn(Arrays.asList(wikiPag2, wikiPag3));
		when(wikiPag2.getLinks()).thenReturn(Arrays.asList(wikiPag1, wikiPag3));
		when(wikiPag3.getLinks()).thenReturn(Arrays.asList(wikiPag4, wikiPag1)); //esta no deberia matchear
		when(wikiPag4.getLinks()).thenReturn(Arrays.asList(wikiPag2, wikiPag4));		
		
	
		ArrayList<WikipediaPage> wikipedia = new ArrayList<>(Arrays.asList(wikiPag2, wikiPag3, wikiPag4));
		
		assertEquals(2, filtroLinks.getSimilarPages(wikiPag1, wikipedia).size());
	}
	
}