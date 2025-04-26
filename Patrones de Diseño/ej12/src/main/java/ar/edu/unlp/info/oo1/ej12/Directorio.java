package ar.edu.unlp.info.oo1.ej12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Directorio extends FileSystemEntry{
	private List<FileSystemEntry> componentes;
	
	public Directorio(String nombre, Date fecha, int size) {
		super(nombre, fecha, size);
		this.componentes = new ArrayList<>();
	}
	
	public void agregarComponente(FileSystemEntry F) {
		this.componentes.add(F);
	}
	
	public int getTamano() {
	    return this.componentes.stream()
	        .mapToInt(c -> c.getTamano()) // llamar getTamano() de cada componente, no getSizeEnBytes()
	        .sum() + 32;
	}

	
	public Archivo archivoMasGrande() {
		return this.componentes.stream()
				.map(FileSystemEntry::archivoMasGrande)
				.filter(Objects::nonNull)
				.max(Comparator.comparingInt(Archivo::getSizeEnBytes)) // AUNQUE EN LINUX TODO SEAN ARCHIVOS COMO PIDE QUE COMPARE ARCHIVOOOOOOS COMPARO ARHCIVOS Y DEVUELVO EL ARHCIVO MAS GRANDE Y NO EL DIRECTORIO
				.orElse(null);
	}

	public Archivo archivoMasNuevo() {
	    return this.componentes.stream()
	        .map(FileSystemEntry::archivoMasNuevo)
	        .filter(Objects::nonNull)
	        .max(Comparator.comparing(FileSystemEntry::getFecha))
	        .orElse(null);
	}

	
	public FileSystemEntry buscar(String nombre) {
	    if (this.getNombre().equals(nombre)) {
	        return this;
	    }
	    return this.componentes.stream()
	        .map(c -> c.buscar(nombre))
	        .filter(Objects::nonNull)
	        .findFirst()
	        .orElse(null);
	}
	
	
	public List<FileSystemEntry> buscarTodos(String nombre) {
	    List<FileSystemEntry> resultado = new ArrayList<>();
	    if (this.getNombre().equals(nombre)) {
	        resultado.add(this);
	    }
	    this.componentes.forEach(c -> resultado.addAll(c.buscarTodos(nombre)));
	    return resultado;
	}
	
	public String listadoDeContenido(String pathPadre) {
	    String nuevoPath = pathPadre + "/" + this.getNombre();
	    StringBuilder sb = new StringBuilder();
	    sb.append(nuevoPath).append("\n");
	    for (FileSystemEntry entry : componentes) {
	        sb.append(entry.listadoDeContenido(nuevoPath));
	    }
	    return sb.toString();
	}
	
	
	
	
}
