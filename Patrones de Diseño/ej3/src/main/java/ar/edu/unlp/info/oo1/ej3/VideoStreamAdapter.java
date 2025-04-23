package ar.edu.unlp.info.oo1.ej3;

public class VideoStreamAdapter implements Media {
    private VideoStream videoStream; // Referencia al <<Adaptee>>

    // Constructor que recibe la instancia a adaptar
    public VideoStreamAdapter(VideoStream videoStream) {
        this.videoStream = videoStream;
    }

    // Implementación del método de la interfaz <<Target>>
    @Override
    public void play() {
        System.out.print("Adapter: Calling reproduce() on VideoStream -> ");
        // Delega la llamada al método correspondiente del <<Adaptee>>
        videoStream.reproduce();
    }
}
