package ar.edu.unlp.info.oo1.ejercicio2;

public class Papel extends Option{
	
	public String jugar(Option o) {
		return o.opcionPapel();
		
	}
	
	
	public String opcionPiedra() {
		return "Has ganado: Papel le gana a la piedra";
	}
	
	public String opcionTijera() {
		return "Has perdido: Tijera le gana a papel";
	}
	
	public String opcionPapel() {
		return "Hubo un empate: Papel empata con Papel";
	}
	
	public String opcionSpock() {
		return "Has ganado: Papel desaprueba Spock";
	}
	
	public String opcionLagarto() {
		return "Has perdido: Lagarto rompe Papel";
	}
	
	
	
}
