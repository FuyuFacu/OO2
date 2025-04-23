package ar.edu.unlp.info.oo1.ej3;

public class VideoFile implements Media {
    private String videoFileData = "some video file data"; // Ejemplo

    @Override
    public void play() {
        System.out.println("Playing Video File: " + videoFileData.substring(0,10) + "...");
        // Lógica para reproducir archivo de video
    }
}
