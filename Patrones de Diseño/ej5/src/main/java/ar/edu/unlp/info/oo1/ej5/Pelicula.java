package ar.edu.unlp.info.oo1.ej5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pelicula {
	private String titulo;
	private Date fechaEstreno;
	private List<Pelicula> similares;
	private int puntaje;
	
	
	public Pelicula(String titulo, Date fechaEstreno, int puntaje) {
		this.titulo = titulo;
		this.fechaEstreno = fechaEstreno;
		this.similares = new ArrayList<>();
		this.puntaje = puntaje;
	}
	
	public void addPeliculaSimilar(Pelicula otra) {
		if (otra != null && !this.similares.contains(otra)) {
			this.similares.add(otra);
			// Logica para la otra pelicula, para asi hacerlo reciproco
			if (!otra.getSimilares().contains(this)) {
				otra.addPeliculaSimilar(this);
			}
		}
	}

	public List<Pelicula> getSimilares() {
		return similares;
	}
	
	public Date getFechaEstreno() {
		return this.fechaEstreno;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public String getTitulo() {
		return titulo;
	}
	
	
	
	
	
	
	
	
	
}
