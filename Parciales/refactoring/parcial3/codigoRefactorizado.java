public class Videojuego {
	// ...
	// 
	public TipoPersonaje personajeConMasDaño() {
		Personaje maximo = personajes.stream()
							.max(Comparator.comparing(personaje -> personaje.getTipoAtaque().getDanio()))
							.orElse(null)

		return maximo;
	}

	public void imprimirInfo(TipoPersonaje p) {

		p.imprimirInfoAtaque();
	}

}


public abstract class TipoPersonaje {
	private String nombre;
	private int daño;
	private TipoAtaque tipoAtaque;

	public TipoPersonaje(String nombre, int daño TipoAtaque tipoAtaque) {
		this.nombre = nombre;
		this.daño = daño;
		this.tipoAtaque = tipoAtaque;
	}

	public getTipoAtaque() {
		return tipoAtaque;
	}


	public void imprimirInfoPersonaje() {
		System.out.println(getNombre() + "tiene como danio " + getDanio());
	}


}

public class PersonajeNulo extends TipoPersonaje{
	Public PersonajeNulo() {
		super("", 0, new AtaqueNulo();
	}

}


public class Personaje extends TipoPersonaje {
	Public Personaje(String nombre, int daño, TipoAtaque tipoAtaque) {
		super(nombre, daño, tipoAtaque
	}

}



public interface TipoAtaque {
	public void imprimirInfoAtaque();
}

public class AtaqueHechizo implements TipoAtaque {

	public void imprimirInfoAtaque() {
			System.out.println("Ataque tipo hechizo");
			System.out.println("Este ataque dobla tu fuerza");		
	}
}

public class AtaqueBasico implements TipoAtaque {

	public void imprimirInfoAtaque() {
		System.out.println("Ataque tipo Ataque Basico");
		System.out.println("Este ataque matniene tu fuerza");	
	}

}


public class AtaqueNulo implements TipoAtaque {	
	public void imprimirInfoAtaque() {
		System.out.println("vacio");	
	}
}
