package ar.edu.unlp.info.oo1.ej9;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private List<AutoEnAlquiler> autos;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.autos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public List<AutoEnAlquiler> getAutos() {
		return autos;
	}
	
	
	
	
}
