package ar.edu.unlp.info.oo2.PatronBuilder;

import ar.edu.unlp.info.oo2.personaje.Personaje;

public abstract class Builder implements IBuilder{
    Personaje personaje;

    public Builder(Personaje personaje) {
        this.personaje = personaje;
    }

    public void reset() {
        this.personaje = new Personaje();
    }

    public abstract void construirArmadura();
    public abstract void construirHabilidades();
    public abstract void construirArma();

}
