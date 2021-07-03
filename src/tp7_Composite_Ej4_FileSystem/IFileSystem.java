package tp7_Composite_Ej4_FileSystem;


import java.time.LocalDate;

public interface IFileSystem {
	
	
	public int totalSize();
	public void printStructure();
	public IFileSystem lastModified();
	public IFileSystem oldestElement();
	public LocalDate getCreationDate();
	
}