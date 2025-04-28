package ar.edu.unlp.info.oo1.ej15;

import java.util.List;

public class Catalogo {
	private List<Componente> componentes;

	public Catalogo(List<Componente> componentes) {
		this.componentes = componentes;
	}
	
	public Componente getComponente(String nombre) {
		return this.componentes.stream()
				.filter(C -> C.getNombre()
				.equals(nombre))
				.findFirst()
				.orElse(null);
	}
	
	
}
