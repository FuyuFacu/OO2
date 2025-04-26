package ar.edu.unlp.info.oo1.ej11;

import java.util.List;

public class TopografiaMixta implements Topografia{
	private List<Topografia> componentes;
	
	
	public TopografiaMixta(List<Topografia> componentes) {
		if (componentes == null || componentes.size() != 4) {
			throw new IllegalArgumentException("Debe tener exactamente 4 componentes");
		}
		
		this.componentes = componentes;
	}
	
	public double proporcionAgua() {
		return this.componentes.stream()
				.mapToDouble(C -> C.proporcionAgua())
				.sum() / this.componentes.size(); // no le pongo 4 para que sea mas flexible el codigo, por si en algun futuro cambian de requisitos
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true; // Si los dos objetos son exactamente la misma instancia (el mismo objeto en memoria), entonces son iguales.
	    if (obj == null || this.getClass() != obj.getClass()) return false;
	    TopografiaMixta otra = (TopografiaMixta) obj;
	    return this.componentes.equals(otra.componentes);
	}

	@Override
	public int hashCode() {
	    return componentes.hashCode();
	}

	
	
	
	
	
}
