package ar.edu.unlp.info.oo2.armaduras;


import ar.edu.unlp.info.oo2.personaje.Personaje;

public class ArmaduraCuero implements Armadura {

    public void recibirDanioEspada(Personaje P) {
        P.decreaseHealth(8);
    }
    public void recibirDanioArco(Personaje P) {
        P.decreaseHealth(5);
    }
    public void recibirDanioBaston(Personaje P) {
        P.decreaseHealth(2);
    }

    public void recibirDanioMartillo(Personaje P) {
        P.decreaseHealth(10);
    }
}
