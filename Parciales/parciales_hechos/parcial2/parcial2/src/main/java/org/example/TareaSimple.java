package org.example;

public class TareaSimple implements ITarea {
	private String nombre;
	private String descripcion;

	private int duracionEstimada;
	private long comienzo;
	private IEstado estadoTarea = new EstadoNoEmpezado();


	public TareaSimple(String nombre, int duracion) {
		this.nombre = nombre;
		this.duracionEstimada = duracion;
		this.comienzo = System.currentTimeMillis();
	}

	public void setEstado(IEstado estado) {
		this.estadoTarea = estado;
	}
	public int duracionEstimada() {
		return this.duracionEstimada;
	}

	public double tiempoUtilizadoTarea() {
		return (comienzo - System.currentTimeMillis()) / 3600000.0; // esto en teoria es para pasar los milisegundos a horas
	}

	public double avanceTarea() {
		return tiempoUtilizadoTarea() / duracionEstimada;
	}


	public void iniciarTarea() {
		this.estadoTarea.empezar(this);
	}

	public void completarTarea() {
		this.estadoTarea.completar(this);
	}




	
}