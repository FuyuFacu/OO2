package ar.edu.unlp.info.oo2.personaje;

import ar.edu.unlp.info.oo2.armaduras.Armadura;
import ar.edu.unlp.info.oo2.armas.Arma;
import ar.edu.unlp.info.oo2.habilidades.Habilidad;

import java.util.ArrayList;
import java.util.List;


public class Personaje {
    private String nombre;
    private Arma arma;
    private Armadura armadura;
    private List<Habilidad> habilidades;
    private int health = 100; // This can be changed for whatever the dev wants


    public Personaje() {
        this.habilidades = new ArrayList<>();
    }

    public void enfrentamiento(Personaje P) {
        if (this.hasHealth() && P.hasHealth()) {
            P.recibirdanio(this.getArma());
        }

    }

    public boolean hasHealth() {
        return this.health > 0;
    }

    public void recibirdanio(Arma arma) {
        arma.atacar( this);
    }

    public Armadura getArmadura() {
        return this.armadura;
    }

    public void agregarHabilidad(Habilidad H) {
        if (H != null)
            this.habilidades.add(H);
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public void decreaseHealth(int value) {
        if (this.health > value)
            this.health -= value;
        else if (this.health > 0)
            this.health = 0;
    }

    private Arma getArma() {
        return this.arma;
    }
}
