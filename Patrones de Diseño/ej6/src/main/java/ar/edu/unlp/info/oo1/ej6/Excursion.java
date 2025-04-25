package ar.edu.unlp.info.oo1.ej6;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
	private String nombre;
	private Date fechaInicio;
	private Date fechaFin;
	private String puntoEncuentro;
	private double costo;
	private int cupoMinimo;
	private int cupoMaximo;
	
	
	private List<Usuario> inscriptos;
	private List<Usuario> espera;
	
	private IEstado estado;
	
	
	public Excursion(String nombre, Date fechaInicio, Date fechaFin, String puntoEncuentro, double costo,
			int cupoMinimo, int cupoMaximo) {
		this.nombre = nombre;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.puntoEncuentro = puntoEncuentro;
		this.costo = costo;
		this.cupoMinimo = cupoMinimo;
		this.cupoMaximo = cupoMaximo;
		this.estado = new EstadoProvisorio();
		
		
		espera = new ArrayList<>();
		inscriptos = new ArrayList<>();
	}
	
	public void inscribir(Usuario u) {
		this.estado.inscribirse(this, u);
	}
	
	public String obtenerInformacion() {
		 return this.estado.obtenerInformacion(this);
	}

	
	public void agregarAListaDeEspera(Usuario u) {
		if (u != null) espera.add(u);
	}
	
	public void agregarAListaInscriptos(Usuario u) {
		if (u != null) inscriptos.add(u);
	}
	
	public void transicionarAInscriptos() {
		inscriptos.addAll(espera);
		espera.clear();
	}
	
	

	
	
	// Todo esto es imprimir para el caso de los estados, para que no haya envidia de atributos
	
	public String imprimirNormal() {
		return this.nombre + this.fechaFin + this.fechaInicio + this.puntoEncuentro + this.costo;
	}
	
	public String imprimirInicioExcursion() {
		return imprimirNormal() + "\n cantidad de usuarios faltantes: " 
				+ (cupoMinimo - this.espera.size()) + "\n";
	}
	public String getEmailsUsuariosInscriptos() {
		return inscriptos.stream().map(Usuario::getEmail).collect(Collectors.joining(", "));
	}
	
	public String imprimirProcesoExcursion() {
		String impr = imprimirNormal();
		return impr + getEmailsUsuariosInscriptos() + "\nfaltan: " + (cupoMaximo - inscriptos.size());
	}
	
	// Condicionales, 
	
	public boolean cupoMinimoAlcanzado() {
		return inscriptos.size() + espera.size() >= cupoMinimo;
	}
	
	public boolean cuposAgotados() {
		return inscriptos.size() == cupoMaximo;
	}



	// GETTERS Y SETTERS
	
	public void setEstado(IEstado e) {
		this.estado = e;
	}
	
	public IEstado getEstado() {
		return this.estado;
	}
	
	
	
	
	
	
}
