package ar.edu.unlp.info.oo1.ej11;

public class TopografiaPantano implements Topografia {
	
	public double proporcionAgua() {
		return 0.7;
	}

	
    @Override
    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return this.getClass().hashCode();
    }
}
