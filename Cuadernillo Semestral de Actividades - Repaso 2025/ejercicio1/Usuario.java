package ar.edu.unlp.info.oo1.ejercicio1;

import java.util.ArrayList;

import java.util.List;


public class Usuario {
	private String nombre;
	private List<Twitt> tweets;
	
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.tweets = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void agregarTweet(Twitt tweet) {
		this.tweets.add(tweet);
	}
	
	public boolean noEstaVacio() {
		return !tweets.isEmpty();
	}
	
	public void eliminarTweets() {
		if (noEstaVacio()) tweets.clear();
	}

	public List<Twitt> getTweets() {
		return tweets;
	}

	
	
	
	
}
