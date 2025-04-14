package ar.edu.unlp.info.oo1.ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MatchTest {
	private Piedra P = new Piedra();
	private Tijeras T = new Tijeras();
	private Papel Pa = new Papel();
	private Lagarto L = new Lagarto();
	private Spock S = new Spock();
	private Match M;
	

	@BeforeEach
	public void setUp() {
		M = new Match(P,T);
	}
	
	
	@Test
	void testPiedraLeGanaATijeras() {
		assertEquals("Has perdido: Piedra gana a la Tijeras", M.jugar());
	}
	
	@Test
	void testTijerasLeGanaAPapel() {
		M = new Match(T,Pa);
		assertEquals("Has perdido: Tijera le gana a papel",M.jugar());
	}
	
	@Test
	void testPiedraPierdeConPapel() {
		M = new Match(P,Pa);
		assertEquals("Has ganado: Papel le gana a la piedra",M.jugar());
	}
	
	@Test
	void testPiedraAplastaLagarto() {
		M = new Match(P,L);
		assertEquals("Has perdido: Piedra aplasta a la Lagarto", M.jugar());
	}

	
	@Test
	void testLagartoEnvenaASpock() {
		M = new Match(L,S);
		assertEquals("Has perdido: Lagarto envenena a Spock", M.jugar());
		
	}
	
}
