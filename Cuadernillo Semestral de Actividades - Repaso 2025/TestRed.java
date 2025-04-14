package ar.edu.unlp.info.oo1.ejercicio1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestRed {
	private Usuario usuario;
	private Usuario usuario2;
	private Twitter twitter;
	private Twitt tweet;
	
	

	@BeforeEach
	public void setUp() {
		usuario = new Usuario("juan1234");
		usuario2 = new Usuario("Jon Snow");
		twitter = new Twitter();
		tweet = new Twitt("odio breaking bad");
	}
	
	
	@Test
	public void testGetNombre() {
		assertEquals("juan1234", usuario.getNombre());
	}

	
	@Test
	public void testEliminarTweets() {
		Twitt tweet = new Twitt("Hola mundito");
		usuario.getTweets().add(tweet);
		usuario.eliminarTweets();
		assertTrue(!usuario.noEstaVacio());
		
	}
	
	@Test
	public void testAgregarUsuario() {
		twitter.agregarUsuario(usuario);
		assertTrue(twitter.contieneUsuario(usuario));
	}
	
	@Test
	public void testEliminarUsuario() {
		twitter.eliminarUsuario(usuario);
		assertFalse(twitter.contieneUsuario(usuario));
	}
	
	@Test
	public void testUsuarioNoRepetido() {
		twitter.agregarUsuario(usuario2);
		twitter.agregarUsuario(usuario2);
		
		assertEquals(1, twitter.getListaUsuarios().size());
	}
	
	
	@Test
	public void testAgregarTweet() {
		this.usuario.agregarTweet(tweet);
		assertTrue(usuario.noEstaVacio());
	}
	
	@Test
	public void testTweetsEliminados() {
		this.usuario.agregarTweet(tweet);
		this.testEliminarTweets();
		assertTrue(!usuario.noEstaVacio());
	}
	
	
	
	
}
