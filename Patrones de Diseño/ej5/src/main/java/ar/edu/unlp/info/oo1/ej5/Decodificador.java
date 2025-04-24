package ar.edu.unlp.info.oo1.ej5;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	final int limite = 3;
	private List<Pelicula> peliculas;
	private ISugeridor sugeridor;
	private List<Pelicula> reproducidas;

	public Decodificador() {
		peliculas = new ArrayList<>();
		reproducidas = new ArrayList<>();
	}
	
	public void setSugeridor(ISugeridor s) {
		this.sugeridor = s;
		
	}
	
	public void addPeliculaGrilla(Pelicula P) {
		if (P != null) {
			peliculas.add(P);
		}
	}
	
	public List<Pelicula> obtenerSugerencias() {
		return this.sugeridor.sugerir(peliculas, reproducidas, limite);
	}
	
 	public void addPeliculaReproducida(Pelicula P) {
 		if (P != null) {
 			reproducidas.add(P);
 		}
 	}
	
	
	
	
	
}
