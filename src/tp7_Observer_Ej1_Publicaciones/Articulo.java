package tp7_Observer_Ej1_Publicaciones;

import java.util.List;

public class Articulo implements IGeneroDeTexto{
	
	private String 			titulo;
	private String 			tipoDeArticulo;
	private String 			lugarDePublicacion;
	private List<String> 	autores;
	private List<String> 	filiaciones;	
	private List<String> 	palabrasClaves;
	
	public Articulo(String titulo, 
			String tipoDeArticulo, 
			String lugarDePublicacion, 
			List<String> autores, 
			List<String> filiaciones,
			List<String> palabrasClave) {
		                      
		this.titulo				=titulo;              
	   	this.tipoDeArticulo		=tipoDeArticulo;      
        this.lugarDePublicacion	=lugarDePublicacion;  
        this.autores			=autores;             
        this.filiaciones		=filiaciones;	     
        this.palabrasClaves		=palabrasClave;   
                                
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}

	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}

	public List<String> getAutores() {
		return autores;
	}

	public List<String> getFiliaciones() {
		return filiaciones;
	}

	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}

	public String getGenero() {
		
		return this.tipoDeArticulo;
	}
	
	
}
        
        
        
        