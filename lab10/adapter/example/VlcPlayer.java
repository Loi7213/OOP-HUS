package lab10.adapter.example;

public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }

    public void playMp4(String fileName) {
        // Do nothing
    }
}
