package ar.edu.unlp.info.oo1.ejercicio2;

public class Match {
	private Option jugador1;
	private Option jugador2;
	
	
	public Match(Option option1, Option option2) {
		this.jugador1 = option1;
		this.jugador2 = option2;
	}
	
	
	public String jugar() {
		return this.jugador1.jugar(jugador2);
	}
	
}
