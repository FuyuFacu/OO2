package ar.edu.unlp.info.oo1.ej12;

import java.util.List;

public class FileSystem {
	private Directorio raiz;
	
	
	public FileSystem(Directorio d) {
		this.raiz = d;
	}
	
	
	  /**
	   * Retorna el espacio total ocupado, incluyendo todo su contenido.
	   */
	public int tamanoTotalOcupado(){
		return raiz.getTamano();
	}

	  /**
	   * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
	   * filesystem 
	   */
	  public Archivo archivoMasGrande(){
		  return raiz.archivoMasGrande();
	  }

	  /**
	   * Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	   * del filesystem
	   */
	  public Archivo archivoMasNuevo() {
		    return raiz.archivoMasNuevo();
	  }


	  /**
	   * Retorna el primer elemento con el nombre solicitado contenido en cualquier
	   * nivel del filesystem
	   */
	  public FileSystemEntry buscar(String nombre) {
		    return raiz.buscar(nombre);
		}


	  /**
	   * Retorna la lista con los elementos que coinciden con el nombre solicitado 
	   * contenido en cualquier nivel del filesystem
	   */
	  public List<FileSystemEntry> buscarTodos(String nombre) {
		    return raiz.buscarTodos(nombre);
	  }


	  /**
	   * Retorna un String con los nombres de los elementos contenidos en todos los 
	   * niveles del filesystem. De cada elemento debe retornar el path completo
	   * (similar al comando pwd de linux) siguiendo el modelo presentado a
	   * continuación
	/Directorio A
	/Directorio A/Directorio A.1
	/Directorio A/Directorio A.1/Directorio A.1.1
	/Directorio A/Directorio A.1/Directorio A.1.2 	
	/Directorio A/Directorio A.2
	/Directorio B
	   */
	  public String listadoDeContenido() {
		    return raiz.listadoDeContenido("");
	  }
	  

	}
