package org.example;

public class EstadoNoEmpezado implements IEstado {
	public void completar(Tarea tarea) {}
	public void empezar(Tarea tarea) {
		tarea.setEstado(new EstadoFinalizado());
	}

}

