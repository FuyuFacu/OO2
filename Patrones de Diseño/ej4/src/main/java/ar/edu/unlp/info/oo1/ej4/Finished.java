package ar.edu.unlp.info.oo1.ej4;

import java.time.Duration;

public class Finished implements Estado {
	public void start(ToDoItem item) {}
	
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("EL task ya termino, no puedes poner en pausa algo que ya finalizo...");
	}
	
	public void finish(ToDoItem item) {}
	
	public Duration workedTime(ToDoItem item) {
		return Duration.between(item.getStartDate(), item.getEndDate());
	}
	
	public void addComment(ToDoItem item, String comment) {}
}
