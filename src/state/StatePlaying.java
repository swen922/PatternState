package state;

import player.AudioPlayer;

public class StatePlaying extends State {


    public StatePlaying(AudioPlayer audioPlayer) {
        super(audioPlayer);
        System.out.println("created new StatePlaying");
    }

    @Override
    public void clickLock() {
        audioPlayer.changeState(new StateLocked(audioPlayer));
    }

    @Override
    public void clickPlay() {
        audioPlayer.stopPlay();
        audioPlayer.changeState(new StateReady(audioPlayer));
    }

    @Override
    public void clickNext() {
        audioPlayer.nextSong();
    }

    @Override
    public void clickPrevious() {
        audioPlayer.previousSong();
    }
}
