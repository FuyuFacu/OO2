package ar.edu.unlp.info.oo1.ejercicio2;

public class Tijeras extends Option {
	
	public String jugar(Option o) {
		return o.opcionTijera();
		
	}
	
	public String opcionPiedra() {
		return "Has perdido: Piedra gana a la Tijeras";
	}
	
	public String opcionTijera() {
		return "Hubo un empate: Tijeras empata con Tijeras";
	}
	
	public String opcionPapel() {
		return "Has ganado: Tijeras le gana a Papel";
	}
	
	public String opcionSpock() {
		return "Has perdido: Spock rompe Tijeras";
	}
	
	public String opcionLagarto() {
		return "Has ganado: Tijeras decapita a Lagarto";
	}
}

