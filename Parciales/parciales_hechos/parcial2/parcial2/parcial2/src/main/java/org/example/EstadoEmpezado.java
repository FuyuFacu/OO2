package org.example;

public class EstadoEmpezado implements IEstado {

	public void completar(Tarea tarea) {
		tarea.setEstado(new EstadoFinalizado());
	}
	
	public void empezar(Tarea tarea) {}


}