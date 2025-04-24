package ar.edu.unlp.info.oo1.ej4;

import java.time.Duration;
import java.time.Instant;

public class InProgress implements Estado{
	public void start(ToDoItem item) {}
	
	public void togglePause(ToDoItem item) {
		item.setEstado(new Paused());
	}
	
	public void finish(ToDoItem item) {
		item.setEndTime();
		item.setEstado(new Finished());
	}
	
	public Duration workedTime(ToDoItem item) {
		return Duration.between(item.getStartDate(), Instant.now());
	}

	public void addComment(ToDoItem item, String comment) {
		item.addCommentInternal(comment);
	}
}
