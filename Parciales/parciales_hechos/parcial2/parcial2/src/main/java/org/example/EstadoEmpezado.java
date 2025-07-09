package org.example;

public class EstadoEmpezado implements IEstado {

	public void completar(ITarea tarea) {
		tarea.setEstado(new EstadoFinalizado());
	}
	
	public void empezar(ITarea tarea) {}


}