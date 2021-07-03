package tp8_TemplateMethodYAdapter_Ej4_LlamadasTelefonicas;

/*
A partir de las siguientes líneas de código identifique estos conceptos, si es posible:
Template Method.
Operaciones primitivas.
Operaciones concretas.
Hook Method.
*/


public class LlamadaDescuento extends LlamadaTelefonica {


	public LlamadaDescuento(int tiempo, int horaDelDia) {
		 	super(tiempo, horaDelDia);
		 		
		}
	
	//Es una operacion concreta
	@Override
	public boolean esHoraPico() { 
		return false;
	}

	//Es una operacion concreta
	@Override
	public float costoNeto() { 
		return this.getTiempo() * 0.95f;
	}
}

