package tp7_Observer_Ej1_Publicaciones;

public interface Observer {
	public abstract String avisarPorArticulo(IGeneroDeTexto articulo);
	public abstract Boolean estaInteresadoEn(String tipoDeArticulo);
}
