package tp8_TemplateMethodYAdapter_Ej3_ElementosSimilares;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFiltroPropiedad {


	WikiPage 				wikiPag1;
	WikiPage 				wikiPag2;
	WikiPage 				wikiPag3;
	WikiPage 				wikiPag4;
	FiltroPropiedad 		filtroPropiedad;

	@BeforeEach
	void setUp() throws Exception {
		wikiPag1 		= mock(WikiPage.class);
		wikiPag2 		= mock(WikiPage.class);
		wikiPag3 		= mock(WikiPage.class);
		wikiPag4 		= mock(WikiPage.class);
		filtroPropiedad = new FiltroPropiedad();
	}

	@Test
	void test001FiltroPropiedadAlRecibirUnaWikipediaSinPaginasNoCoincideNingunaPagina() {
		
		ArrayList<WikipediaPage> wikiVacia = new ArrayList<WikipediaPage>();
	
		assertEquals(0, filtroPropiedad.getSimilarPages(wikiPag1, wikiVacia).size());
	}
	
	@Test
	void test002FiltroPropiedadSabeLaCantidadDePaginasQueCoincidenSiCoincideAlgunaDeSusPropiedades() {
		
		when(wikiPag1.getInfobox()).thenReturn(Map.of("Spinetta", wikiPag2));
		when(wikiPag2.getInfobox()).thenReturn(Map.of("Cerati", wikiPag3));
		when(wikiPag3.getInfobox()).thenReturn(Map.of("Charly", wikiPag4));
		when(wikiPag4.getInfobox()).thenReturn(Map.of("Spinetta", wikiPag1));
	
		ArrayList<WikipediaPage> wikipedia = new ArrayList<>(Arrays.asList(wikiPag2, wikiPag3, wikiPag4));
		
		assertEquals(1, filtroPropiedad.getSimilarPages(wikiPag1, wikipedia).size());
	}
}
	
