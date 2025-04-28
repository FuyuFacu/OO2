package ar.edu.unlp.info.oo1.ej15;

import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
	private List<Componente> componentes;
	
	
	public Presupuesto() {
		this.componentes = new ArrayList<>();
	}


	public List<Componente> getComponentes() {
		return componentes;
	}



	public void agregarComponente(Componente e) {
		this.componentes.add(e);
	}
	
	public double calcularConsumos() {
		return this.componentes.stream().mapToDouble(c -> c.getConsumo()).sum();
	}
	
	public double calcularPrecioConIVA() {
	    double precioBase = this.componentes.stream().mapToDouble(c -> c.getPrecio()).sum();
	    return precioBase * 1.21;
	}

}

