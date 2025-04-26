package ar.edu.unlp.info.oo1.ej12;

import java.util.Date;
import java.util.List;

public abstract class FileSystemEntry {
	private String nombre;
	private Date fecha;
	private int sizeEnBytes;
	
	public FileSystemEntry(String nombre, Date fecha, int sizeEnBytes) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.sizeEnBytes = sizeEnBytes;
	}

	public String getNombre() {
		return nombre;
	}

	public Date getFecha() {
		return fecha;
	}
	
	public int getSizeEnBytes() {
		return sizeEnBytes;
	}

	public abstract int getTamano();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	public abstract FileSystemEntry buscar(String nombre);
	public abstract List<FileSystemEntry> buscarTodos(String nombre);
	public abstract String listadoDeContenido(String pathPadre);

	
}
