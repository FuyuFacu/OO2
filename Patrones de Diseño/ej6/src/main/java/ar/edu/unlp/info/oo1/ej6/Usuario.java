package ar.edu.unlp.info.oo1.ej6;

public class Usuario {
	private String nombre;
	private String email;
	private String apellido;
	
	
	public Usuario(String nombre, String email, String apellido) {
		this.nombre = nombre;
		this.email = email;
		this.apellido = apellido;
	}
	
	public String getEmail() {
		return this.email;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	
	
}
