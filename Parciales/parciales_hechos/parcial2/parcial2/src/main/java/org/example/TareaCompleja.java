package org.example;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja implements ITarea {
	private List<ITarea> tareas;


	public TareaCompleja(List<ITarea> tareas) {
		this.tareas = tareas;
	}

	public int duracionEstimada() {
		return this.tareas.stream()
			.mapToInt(ITarea::duracionEstimada).sum();

	}
	public double tiempoUtilizadoTarea() {
		return this.tareas.stream()
			.mapToDouble(ITarea::tiempoUtilizadoTarea)
			.sum();
	}
	public void setEstado(IEstado estado) {}

	public double avanceTarea() {
		return tiempoUtilizadoTarea() / duracionEstimada();
	}


	public void iniciarTarea() {
		this.tareas.forEach(ITarea::iniciarTarea);
	}


	public void completarTarea() {
		this.tareas.forEach(ITarea::completarTarea);
	}

	
}