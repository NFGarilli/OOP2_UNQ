package tp7_Observer_Ej1_Publicaciones;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaDeReferenciaTest {

	IGeneroDeTexto 	articulo;
	Investigador 	investigador;
	SistemaDeReferencia sisDeRef;
	
	@BeforeEach
	void setUp() throws Exception {
		articulo 		= new Articulo(	"titulo" ,
										"policial" ,
										"ranelah" ,
										new ArrayList<String>(), 
										new ArrayList<String>(),
										new ArrayList<String>());
		
		investigador 	= mock(Investigador.class); 
		sisDeRef = new SistemaDeReferencia();
	}

	@Test
	void test001UnSistemaDeReferenciaSeInstanciaCorrectamente() {
		sisDeRef.agregarInteresado(investigador);
		sisDeRef.registrarArticulo(articulo);
		investigador.agregarGeneroInteresado(articulo.getGenero());
		
		when(investigador.estaInteresadoEn(articulo.getGenero())).thenReturn(true);
		
		verify(investigador, times(1)).avisarPorArticulo(articulo);
	}

}
