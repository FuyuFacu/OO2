package ar.edu.unlp.info.oo1.ej12;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Archivo extends FileSystemEntry{

	public Archivo(String nombre, Date fecha, int sizeEnBytes) {
		super(nombre, fecha, sizeEnBytes);
	}
	
	public int getTamano() {
		return this.getSizeEnBytes();
	}
	
	public Archivo archivoMasGrande() {
	    return this;
	}
	
	public Archivo archivoMasNuevo() {
	    return this;
	}

	public FileSystemEntry buscar(String nombre) {
	    if (this.getNombre().equals(nombre)) {
	        return this;
	    }
	    return null;
	}

	
	public List<FileSystemEntry> buscarTodos(String nombre) {
	    List<FileSystemEntry> resultado = new ArrayList<>();
	    if (this.getNombre().equals(nombre)) {
	        resultado.add(this);
	    }
	    return resultado;
	}
	
	public String listadoDeContenido(String pathPadre) {
	    return pathPadre + "/" + this.getNombre() + "\n";
	}
	
	
}

