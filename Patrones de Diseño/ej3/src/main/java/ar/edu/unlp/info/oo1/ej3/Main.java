package ar.edu.unlp.info.oo1.ej3;

public class Main {
    public static void main(String[] args) {
        // Crear el cliente
        MediaPlayer player = new MediaPlayer();

        // Crear instancias de los tipos de media originales
        Media audio1 = new Audio();
        Media video1 = new VideoFile();

        // Crear una instancia de la clase a adaptar
        VideoStream stream1 = new VideoStream();

        // Crear el adaptador y pasarle la instancia del Adaptee
        Media adaptedStream = new VideoStreamAdapter(stream1);

        // Añadir todos los tipos de media (incluido el adaptado) al MediaPlayer
        player.addMedia(audio1);
        player.addMedia(video1);
        player.addMedia(adaptedStream); // El player no sabe que es un adaptador, solo ve Media

        // Reproducir todo
        player.playAll();

        // Ejemplo 2: Otro stream adaptado
        VideoStream stream2 = new VideoStream(); // Podría tener otra URL interna
        Media adaptedStream2 = new VideoStreamAdapter(stream2);
        player.addMedia(adaptedStream2);

        player.playAll(); // Reproduce la lista actualizada
    }
}
