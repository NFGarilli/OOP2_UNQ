package tp7_Observer_Ej2_EncuentrosDeportivos;

public interface IListener {
	public void update(ResultadoPartido partido);
	public Boolean estaInteresado(ResultadoPartido partido);
}
