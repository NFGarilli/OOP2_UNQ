package tp7_Composite_Ej4_FileSystem;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Directory implements IFileSystem {
	
	String nombre;
	List<IFileSystem> contenido;
	LocalDate fechaCreacion;
	
	public Directory(String nombre, List<IFileSystem> contenido){
		super();
		this.nombre = nombre;
		this.contenido = new ArrayList<IFileSystem>();
		this.fechaCreacion = LocalDate.now();
		
	}

	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return this.contenido.stream().mapToInt(c -> c.totalSize()).sum();
	}

	@Override
	public void printStructure() {
		
		// TODO Auto-generated method stub
		this.contenido.stream().forEach(c -> c.printStructure());

	}

	@Override
	public IFileSystem lastModified() {
		// TODO Auto-generated method stub		
		List<IFileSystem> listaDeLaMasReciente = this.contenido.stream().sorted((c1, c2) -> c2.getCreationDate().compareTo(c1.getCreationDate())).limit(1).collect(Collectors.toList());
		
		return listaDeLaMasReciente.get(0);
				
	}

	@Override
	public IFileSystem oldestElement() {
		// TODO Auto-generated method stub
		List<IFileSystem> listaDelMasAntiguo = this.contenido.stream().sorted((c1, c2) -> c1.getCreationDate().compareTo(c2.getCreationDate())).limit(1).collect(Collectors.toList());
		
		return listaDelMasAntiguo.get(0);
	}

	@Override
	public LocalDate getCreationDate() {
		// TODO Auto-generated method stub
		return fechaCreacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<IFileSystem> getContenido() {
		return contenido;
	}

	public void setContenido(List<IFileSystem> contenido) {
		this.contenido = contenido;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	
	

}
