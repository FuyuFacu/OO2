package ar.edu.unlp.info.oo1.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	private List<Usuario> listaUsuarios = new ArrayList<>();
	
	
	// Agrego el usuario
	public void agregarUsuario(Usuario s) {
		if (usuarioNoRepetido(s)) listaUsuarios.add(s);
	}
	
	// Elimino el usuario
	public void eliminarUsuario(Usuario s) {
		if (contieneUsuario(s)) s.eliminarTweets();
	}
	
	
	
	
	// Me fijo que el usuario verdaderamente se encuentre en la lista
	public boolean contieneUsuario(Usuario s) {
		return listaUsuarios.stream().anyMatch(u -> u.getNombre().equals(s.getNombre()));
	}
	
	// Me aseguro de que el usuario no se encuentre ya en twitter
	public boolean usuarioNoRepetido(Usuario s) {
		return !contieneUsuario(s); 
	}
	

	
}
