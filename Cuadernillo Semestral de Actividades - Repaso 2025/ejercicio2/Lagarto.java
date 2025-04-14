package ar.edu.unlp.info.oo1.ejercicio2;

public class Lagarto extends Option{
	public String jugar(Option o) {
		return o.opcionLagarto();
		
	}
	
	public String opcionPiedra() {
		return "Has perdido: Piedra aplasta a la Lagarto";
	}
	
	public String opcionTijera() {
		return "Has perdido: Tijeras decapita a Lagarto";
	}
	
	public String opcionPapel() {
		return "Has ganado: Lagarto come a Papel";
	}
	
	public String opcionLagarto() {
		return "Hubo un empate: Lagarto empata con Lagarto";
	}
	
	public String opcionSpock() {
		return "Has ganado: Lagarto envenena a Spock";
	}
}
