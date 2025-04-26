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
	    if (obj == null || this.getClass() != obj.getClass()) return false; // Si el objeto recibido (obj) es null, no puede ser igual a nada, entonces devuelvo false
	    																	// Si el objeto recibido (obj) no es de la misma clase que el objeto actual (this), tampoco son iguales, entonces también devuelvo false.
	    																	// compara si this y obj son exactamente del mismo tipo (por ejemplo, dos TopografiaMixta, o dos TopografiaAgua, etc.).
	    
	    TopografiaMixta otra = (TopografiaMixta) obj;						// casteo obj a TopografiaMixta, ya que comprobé que obj no es null y son de la misma clase			
	    return this.componentes.equals(otra.componentes);					// Compruebo si la lista de componentes de "this" es igual a la lista de componentes de otra.
	}																		// Uso List.equals() por que compara cantidad de elementos, orden, y que acad aelemento sea equals a su correspondiente.

	@Override
	public int hashCode() {
	    return componentes.hashCode();
	}

	
	
	
	
	
}
