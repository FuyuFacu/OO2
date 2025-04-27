package ar.edu.unlp.info.oo1.ej14;

import java.util.ArrayList;
import java.util.List;

public class Mixta implements Prenda{
	private List<Prenda> combinaciones;
	
	public Mixta() {
		this.combinaciones = new ArrayList<>();
	}
	
	public void agregarPrenda(Prenda P) {
		if (P != null) this.combinaciones.add(P);
	}
	
	public double calcularValor() {
		return this.combinaciones.stream()
				.mapToDouble(Prenda::calcularValor)
				.sum();
	}
	
	public double calcularValorPrendario() {
		return this.calcularValor() * 0.5;
	}
}
 