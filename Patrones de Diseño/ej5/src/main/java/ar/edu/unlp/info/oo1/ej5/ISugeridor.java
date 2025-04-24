package ar.edu.unlp.info.oo1.ej5;

import java.util.List;

public interface ISugeridor {
	public List<Pelicula> sugerir(List<Pelicula> peliculas, List<Pelicula> reproducidas, int limite);
}
