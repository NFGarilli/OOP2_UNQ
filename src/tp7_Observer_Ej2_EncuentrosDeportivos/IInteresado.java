package tp7_Observer_Ej2_EncuentrosDeportivos;

public interface IInteresado {
	public void setInteresEnDeporte(String deporte);
	public void setInteresEnContrincante(String contrincante);
	public void removeInteresEnDeporte(String deporte);
	public void removeInteresEnContrincante(String contrincante);
}
