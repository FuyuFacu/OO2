package ar.edu.unlp.info.oo1.ej5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Similaridad implements ISugeridor{
	
	public List<Pelicula> sugerir(List<Pelicula> peliculas, List<Pelicula> reproducidas, int limite){
		
		
		
		return reproducidas.stream()
				// reuno todas las listas de similares en un solo stream
				.flatMap(vista -> vista.getSimilares().stream())
				// Elimino duplicados
				.distinct()
				// Excluyo las que ya se han visto y me quedo simplemente con las que no se vieron
				.filter(p -> !reproducidas.contains(p))
				// Las ordeno a menos reciente
				.sorted(Comparator.comparing(Pelicula::getFechaEstreno).reversed())
				// las limito a 3
				.limit(limite)
				.collect(Collectors.toList());
		
	}
	
	
	

}
