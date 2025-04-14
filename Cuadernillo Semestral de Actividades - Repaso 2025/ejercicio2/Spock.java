package ar.edu.unlp.info.oo1.ejercicio2;

public class Spock extends Option{
	public String jugar(Option o) {
		return o.opcionSpock();
		
	}
	
	public String opcionPiedra() {
		return "Has ganado: Spock evaporiza Piedra";
	}
	
	public String opcionTijera() {
		return "Has ganado: Spock rompe Tijeras";
	}
	
	public String opcionPapel() {
		return "Has perdido: Papel desaprueba a Spock";
	}
	
	public String opcionLagarto() {
		return "Has perdido: Lagarto envenena a Spock";
	}

	public String opcionSpock() {
		return "Hubo un empate: Spock empata con Spock";
	}
}
