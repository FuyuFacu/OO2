package ar.edu.unlp.info.oo1.ej3;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
    private List<Media> mediaList = new ArrayList<>();

    public void addMedia(Media media) {
        this.mediaList.add(media);
        System.out.println("Added media: " + media.getClass().getSimpleName());
    }

    public void playAll() {
        System.out.println("\n--- MediaPlayer: Playing All ---");
        if (mediaList.isEmpty()) {
            System.out.println("Playlist is empty.");
            return;
        }
        for (Media media : mediaList) {
            media.play(); // Llama polimórficamente a play()
        }
        System.out.println("--- Playback Finished ---\n");
    }
}
