package org.example;

public abstract class Tarea {
	private IEstado tipoEstado = new EstadoNoEmpezado();
	private String nombre;
	private String descripcion;
	private int duracionEstimada;
	private long comienzo;

	public Tarea(String nombre, String descripcion, int duracionEstimada, long comienzo) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.duracionEstimada = duracionEstimada;
		this.comienzo = comienzo;
	}

	public void setEstado(IEstado estado) {
		this.tipoEstado = estado;
	}

	public IEstado getEstadoTarea() {
		return this.tipoEstado;
	}

	public IEstado getTipoEstado() {
		return tipoEstado;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getDuracionEstimada() {
		return duracionEstimada;
	}

	public long getComienzo() {
		return comienzo;
	}

	public abstract int duracionEstimada();
	public abstract double tiempoUtilizadoTarea();
	public abstract double avanceTarea();
	public abstract void iniciarTarea();
	public abstract void completarTarea();

}