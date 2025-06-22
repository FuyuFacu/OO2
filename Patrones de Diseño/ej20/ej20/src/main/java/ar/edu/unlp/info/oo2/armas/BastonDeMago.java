package ar.edu.unlp.info.oo2.armas;

import ar.edu.unlp.info.oo2.personaje.Personaje;

public class BastonDeMago implements Arma {
    public void atacar(Personaje P) {
        P.getArmadura().recibirDanioBaston(P);
    }
}
