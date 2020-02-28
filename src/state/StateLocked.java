package state;

import player.AudioPlayer;

public class StateLocked extends State {

    public StateLocked(AudioPlayer audioPlayer) {
        super(audioPlayer);
        System.out.println("created new StateLocked");
    }

    @Override
    public void clickLock() {
        if (audioPlayer.isPlaying()) {
            audioPlayer.changeState(new StatePlaying(audioPlayer));
        }
        else {
            audioPlayer.changeState(new StateReady(audioPlayer));
        }

    }

    @Override
    public void clickPlay() {

    }

    @Override
    public void clickNext() {

    }

    @Override
    public void clickPrevious() {

    }
}
