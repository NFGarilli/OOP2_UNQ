package tp7_Composite_Ej3_Warcraft;


public class Ingeniero implements IPersonaje {
	Integer lajas;
	
	public Ingeniero(Integer lajas) {
		super();
		this.lajas = lajas;
	}
	

	@Override 
	public void caminar(Punto punto) {
		//Logica de caminar del ingeniero, pone lajas si no hay ninguna en su ubicacion actual, cuando se queda sin lajas, camina normalmente.;
	}


	public Integer getLajas() {
		return lajas;
	}


	public void setLajas(Integer lajas) {
		this.lajas = lajas;
	}

	
	
}
