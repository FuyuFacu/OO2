package org.example;

public interface ITarea {

	public int duracionEstimada();
	public double tiempoUtilizadoTarea();
	public double avanceTarea();
	public void iniciarTarea();
	public void completarTarea();
	public void setEstado(IEstado estado);

}