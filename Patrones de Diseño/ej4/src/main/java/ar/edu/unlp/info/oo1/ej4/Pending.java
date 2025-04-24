package ar.edu.unlp.info.oo1.ej4;

import java.time.Duration;

public class Pending implements Estado{

	
	public void start(ToDoItem item) {
		item.setStartTime();
		item.setEstado(new InProgress());
	}
	
	
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El estado del task esta en Pending, no puedes pausar algo que no empezo xdd");
	}
	
	public void finish(ToDoItem item) {}
	
	public Duration workedTime(ToDoItem item) {
		throw new RuntimeException("El estado actual del task es Pending, todavia no se puede calcular un tiempo exacto");
	}
	
	public void addComment(ToDoItem item, String comment) {
		item.addCommentInternal(comment);
	}
	
}
