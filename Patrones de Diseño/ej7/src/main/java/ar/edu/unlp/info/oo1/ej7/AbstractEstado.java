package ar.edu.unlp.info.oo1.ej7;

//1) Clase base con comportamiento por defecto (envía todo a error)
public abstract class AbstractEstado implements EstadoCalculadora {

	@Override public void mas(Calculadora c)      { 
		c.setEstado(new EstadoError());
	}
	@Override public void menos(Calculadora c)    { 
		c.setEstado(new EstadoError());
	}
	@Override public void por(Calculadora c)      { 
		c.setEstado(new EstadoError());
	}
	@Override public void dividido(Calculadora c) {
		c.setEstado(new EstadoError());
	}
	@Override public void borrar(Calculadora c)   { 
		c.setEstado(new EstadoError());
	}
	@Override public String getResultado(Calculadora c) {
		c.setEstado(new EstadoError());
		return "error";
	}


	// Nota: no definimos setValor aquí, lo harán las subclases que lo necesiten.
}
