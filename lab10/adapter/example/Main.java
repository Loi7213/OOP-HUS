package lab10.adapter.example;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("vlc", "movie.vlc");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("avi", "movie.avi");
    }
}