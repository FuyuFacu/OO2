package ar.edu.unlp.info.oo1.ej11;

public class TopografiaTierra implements Topografia{
	
	
	public double proporcionAgua() {
		return 0;
	}
	
	public boolean equals(Object obj) {
		return obj != null && this.getClass() == obj.getClass();
	}
	
	
	@Override
	public int hashCode() {
	    return this.getClass().hashCode();
	}
}
