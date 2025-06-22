package ar.edu.unlp.info.oo2.PatronBuilder;

import ar.edu.unlp.info.oo2.personaje.Personaje;

public class Director {

    public void construir(IBuilder concreteBuilder) {
        concreteBuilder.construirArma();
        concreteBuilder.construirHabilidades();
        concreteBuilder.construirArmadura();
    }
}
