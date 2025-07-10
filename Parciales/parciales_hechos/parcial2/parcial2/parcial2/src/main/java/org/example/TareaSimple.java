package org.example;

public class TareaSimple extends Tarea {

	public TareaSimple(String nombre, String descripcion, int duracionEstimada, long comienzo) {
		super(nombre, descripcion, duracionEstimada, comienzo);
	}

	public int duracionEstimada() {
		return this.getDuracionEstimada();
	}

	public double tiempoUtilizadoTarea() {
		return (this.getComienzo() - System.currentTimeMillis()) / 3600000.0; // esto en teoria es para pasar los milisegundos a horas
	}

	public double avanceTarea() {
		return tiempoUtilizadoTarea() / this.getDuracionEstimada();
	}


	public void iniciarTarea() {
		this.getEstadoTarea().empezar(this);
	}

	public void completarTarea() {
		this.getEstadoTarea().completar(this);
	}




	
}