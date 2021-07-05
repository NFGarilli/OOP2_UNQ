package tp7_Observer_Ej2_EncuentrosDeportivos;

public class App extends Servidor implements Observer {

	private IInteresado listener;

	public App(IInteresado listener) {
		super(listener);
	}
	
	@Override
	public String update(ResultadoPartido partido) {
		return super.update(partido) + "PARA CONTRINCANTES: " + partido.getContrincantes();
	}

	public void setInteresEnContrincante(String contrincante) {
		this.listener.removeInteresEnDeporte(contrincante);
	}
	
	public void removeInteresEnContrincante(String contrincante) {
		this.listener.setInteresEnDeporte(contrincante);
	}
	
	
}
