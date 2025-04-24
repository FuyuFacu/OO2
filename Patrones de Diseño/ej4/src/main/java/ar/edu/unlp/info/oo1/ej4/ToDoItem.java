package ar.edu.unlp.info.oo1.ej4;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	private String name;
	private List<String> comments = new ArrayList<>();
	private Estado estado;
	private LocalDate startDate;
	private LocalDate endDate;
	
	
/**
* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
*/
        public ToDoItem(String name) {
        	if (name == null || name.isBlank()) {
        		throw new RuntimeException("El nombre no puede ser nulo o que este vacio");
        	}
        	this.name = name;
        	estado = new Pending();
        }

   	/**
* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
* pending. Si se encuentra en otro estado, no hace nada.
*/
        public void start() {
        	this.estado.start(this);
        }
	/**
* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
* estado es paused. Caso contrario (pending o finished) genera un error
* informando la causa específica del mismo.
*/

        public void togglePause() {
        	estado.togglePause(this);
        }


    	/**
    * Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
    * in-progress o paused. Si se encuentra en otro estado, no hace nada.
    */
            public void finish() {
            	estado.finish(this);
            }


    	/**
    * Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
    * hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
    * haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
    * genera un error informando la causa específica del mismo.
    */
            public Duration workedTime() {
            	return estado.workedTime(this);
            }


    /**
    * Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
    * contrario no hace nada."
    */
            public void addComment(String comment) {
            	if (comment == null || comment.isBlank()) {
            		throw new RuntimeException("EL comentario no puede ser nulo o estar vacio xd");
            	}
            	estado.addComment(this, comment);
            }
            public void addCommentInternal(String comment) {
            	comments.add(comment);
            }
            
            

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public void setStartTime() {
		this.startDate = LocalDate.now();
	}
	public void setEndTime() {
		this.endDate = LocalDate.now();
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}
	
	public String getName() {
		return this.name;
	}
	
	
            
            
    
}
