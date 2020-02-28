import player.AudioPlayer;

/** Состояние, также известен как: State */

public class App {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.clickPlay();
        audioPlayer.clickPlay();
        audioPlayer.clickLock();

    }
}
