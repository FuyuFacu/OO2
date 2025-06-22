package ar.edu.unlp.info.oo2.armas;

import ar.edu.unlp.info.oo2.personaje.Personaje;

public class Arco implements Arma {

    @Override
    public void atacar(Personaje P) {
        P.getArmadura().recibirDanioArco(P);
    }
}
