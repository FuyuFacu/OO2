package org.example;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja extends Tarea {
	private List<Tarea> tareas;

	public TareaCompleja(String nombre, String descripcion, int duracionEstimada, long comienzo, List<Tarea> tareas) {
		super(nombre, descripcion, duracionEstimada, comienzo);
		this.tareas = tareas;
	}

	public int duracionEstimada() {
		return this.tareas.stream()
			.mapToInt(Tarea::duracionEstimada).sum() + this.getDuracionEstimada();

	}

	public double tiempoUtilizadoTarea() {
		return this.tareas.stream()
			.mapToDouble(Tarea::tiempoUtilizadoTarea)
			.sum() + this.tiempoUtilizadoTarea();
	}

	public void setEstado(IEstado estado) {}

	public double avanceTarea() {
		return tiempoUtilizadoTarea() / duracionEstimada();
	}

	public void iniciarTarea() {
		this.tareas.forEach(Tarea::iniciarTarea);

		// Una vez hecho la propagacion, ahora toca hacerlo en la propia
		this.getEstadoTarea().empezar(this);
	}


	public void completarTarea() {
		this.tareas.forEach(Tarea::completarTarea);

		// Una vez hecho la propagacion, ahora toca hacerlo en la propia
		this.getEstadoTarea().completar(this);
	}

	
}