package org.example;

public class EstadoNoEmpezado implements IEstado {

	public void completar(ITarea tarea) {}
	
	public void empezar(ITarea tarea) {
		tarea.setEstado(new EstadoFinalizado());
	}

}