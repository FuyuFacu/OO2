package ar.edu.unlp.info.oo1.ejercicio1;

import java.util.ArrayList;

import java.util.List;


public class Usuario {
	private String nombre;
	private List<Twitt> tweets = new ArrayList<>();
	
	
	
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public boolean noEstaVacio() {
		return !tweets.isEmpty();
	}
	
	public void eliminarTweets() {
		if (noEstaVacio()) tweets.clear();
	}
	
	
	
}
