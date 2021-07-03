package tp7_Composite_Ej2_Cultivos;

public class PorcionPura implements IPorcion {
		private Double gananciaPorcion;
		
		public PorcionPura(Double gananciaPorcion) {
				super();
				this.gananciaPorcion = gananciaPorcion;
		}

		public Double gananciaPorcion() {
			return gananciaPorcion;
		}

		public void setGananciaPorcion(Double gananciaPorcion) {
			this.gananciaPorcion = gananciaPorcion;
		}
		

}
