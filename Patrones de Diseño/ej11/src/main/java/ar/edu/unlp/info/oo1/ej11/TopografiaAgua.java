package ar.edu.unlp.info.oo1.ej11;

public class TopografiaAgua implements Topografia{
	
	public double proporcionAgua() {
		return 1;
	}
	
	public boolean equals(Object obj) {
		return obj != null && this.getClass() == obj.getClass();
	}
	
	
	@Override
	public int hashCode() {
	    return this.getClass().hashCode();
	}
	
	public double proporcionTierra() {
		return 0.0;
	}
}
