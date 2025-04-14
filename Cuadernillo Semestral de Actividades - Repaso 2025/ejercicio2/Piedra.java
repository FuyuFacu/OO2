package ar.edu.unlp.info.oo1.ejercicio2;

public class Piedra extends Option{
	
	public String jugar(Option o) {
		return o.opcionPiedra();
	}
	
	public String opcionPiedra() {
		return "Hubo un empate: Piedra empata con Piedra";
	}
	
	public String opcionTijera() {
		return "Has ganado: Piedra le gana a Tijeras";
	}
	
	public String opcionPapel() {
		return "Has perdido: Papel gana a la Piedra";
	}
	
	public String opcionSpock() {
		return "Has perdido: Spock evaporiza Piedra";
	}
	
	public String opcionLagarto() {
		return "Has ganado: Piedra aplasta a Lagarto";
	}
	
}
