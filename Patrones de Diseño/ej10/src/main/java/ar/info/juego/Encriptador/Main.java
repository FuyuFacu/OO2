package ar.info.juego.Encriptador;

public class Main {
    public static void main(String[] args) {
        // Primero usamos FeistelCipher
        Cifrador cifradorFeistel = new CifradorFeistel("miClaveFeistel");
        Mensajero mensajero = new Mensajero(cifradorFeistel);

        String mensajeOriginal = "Hola, mundo!";
        String mensajeCifrado = mensajero.enviar(mensajeOriginal);
        System.out.println("Cifrado con Feistel: " + mensajeCifrado);

        // Cambiamos a RC4
        Cifrador cifradorRC4 = new CifradorRC4("claveRC4");
        mensajero.setCifrador(cifradorRC4);

        String mensajeCifradoRC4 = mensajero.enviar(mensajeOriginal);
        System.out.println("Cifrado con RC4: " + mensajeCifradoRC4);
    }
}

