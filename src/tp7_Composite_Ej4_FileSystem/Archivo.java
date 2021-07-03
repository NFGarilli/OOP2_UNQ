package tp7_Composite_Ej4_FileSystem;


import java.time.LocalDate;

public class Archivo implements IFileSystem {
	
	String nombre;
	Integer espacioQueOcupa;
	LocalDate ultimaModificacion;
	LocalDate fechaCreacion;
	
	public Archivo(String nombre,Integer espacioQueOcupa) {
		super();
		this.nombre = nombre;
		this.espacioQueOcupa = espacioQueOcupa;
		this.ultimaModificacion = LocalDate.now();
		this.fechaCreacion = LocalDate.now();
		
	}

	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return this.espacioQueOcupa;
	}

	@Override
	public void printStructure() {
		
		System.out.println(nombre);

	}

	@Override
	public IFileSystem lastModified() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public IFileSystem oldestElement() {
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public LocalDate getCreationDate() {
		// TODO Auto-generated method stub
		return this.fechaCreacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEspacioQueOcupa() {
		return espacioQueOcupa;
	}

	public void setEspacioQueOcupa(Integer espacioQueOcupa) {
		this.espacioQueOcupa = espacioQueOcupa;
	}

	public LocalDate getUltimaModificacion() {
		return ultimaModificacion;
	}

	public void setUltimaModificacion(LocalDate ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	
	
	
}
