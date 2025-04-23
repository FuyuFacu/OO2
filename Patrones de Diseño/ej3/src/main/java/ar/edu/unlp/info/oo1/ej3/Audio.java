package ar.edu.unlp.info.oo1.ej3;

public class Audio implements Media {
    private String audioData = "audio data"; // Ejemplo

    @Override
    public void play() {
        System.out.println("Playing Audio: " + audioData.substring(0,10) + "...");
    }
}
