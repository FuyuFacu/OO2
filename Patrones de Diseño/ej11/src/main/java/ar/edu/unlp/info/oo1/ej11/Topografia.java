package ar.edu.unlp.info.oo1.ej11;

public interface Topografia {
	
	public double proporcionAgua();
	
	default double proporcionTierra() {
	    return 1.0 - this.proporcionAgua();
	}
}
