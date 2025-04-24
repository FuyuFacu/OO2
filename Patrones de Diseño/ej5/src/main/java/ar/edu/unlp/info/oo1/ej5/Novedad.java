package ar.edu.unlp.info.oo1.ej5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Novedad implements ISugeridor {
	
	public List<Pelicula> sugerir(List<Pelicula> peliculas, List<Pelicula> reproducidas, int limite) {
		
		return peliculas.stream()
				.filter(p -> !reproducidas.contains(p))
				.sorted(Comparator.comparing(Pelicula::getFechaEstreno).reversed())
				.limit(limite)
				.collect(Collectors.toList());
	}
	
	
	
}
