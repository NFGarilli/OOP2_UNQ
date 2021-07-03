package tp8_TemplateMethodYAdapter_Ej4_LlamadasTelefonicas;

/*
 A partir de las siguientes líneas de código identifique estos conceptos, si es posible:
 Template Method.
 Operaciones primitivas.
 Operaciones concretas.
 Hook Method.
 
*/



	public abstract class LlamadaTelefonica {

		private int tiempo;
		private int horaDelDia;

		public LlamadaTelefonica(int tiempo, int horaDelDia) {
			this.tiempo 	= tiempo;
			this.horaDelDia = horaDelDia;
		}
		
		//es una operacion primitiva
		public int getTiempo() {
			return this.tiempo;
		}
		
		//es una operacion primitiva
		public int getHoraDelDia() { 
			return this.horaDelDia;
		}
		
		//es una operacion primitiva
		public abstract boolean esHoraPico(); 

		//es un template method.
		public float costoFinal() { 
			if (this.esHoraPico()) {
				return this.costoNeto() * 1.2f * this.getTiempo();
			} else {
				return this.costoNeto() * this.getTiempo();
			}
		}

		//es un hook method
		public float costoNeto() { 
			return this.getTiempo() * 1;
		}
		
	}



