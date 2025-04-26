package ar.info.juego.Encriptador;

public class Mensajero {
    private Cifrador cifrador;

    public Mensajero(Cifrador cifrador) {
        this.cifrador = cifrador;
    }

    public void setCifrador(Cifrador nuevoCifrador) {
        this.cifrador = nuevoCifrador;
    }

    public String enviar(String mensaje) {
        return cifrador.cifrar(mensaje);
    }

    public String recibir(String mensajeCifrado) {
        return cifrador.descifrar(mensajeCifrado);
    }
}

