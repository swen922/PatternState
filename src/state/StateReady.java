package state;

import player.AudioPlayer;

public class StateReady extends State {

    public StateReady(AudioPlayer audioPlayer) {
        super(audioPlayer);
        System.out.println("created new StateReady");
    }

    @Override
    public void clickLock() {
        audioPlayer.changeState(new StateLocked(audioPlayer));
    }

    @Override
    public void clickPlay() {
        audioPlayer.startPlay();
        audioPlayer.changeState(new StatePlaying(audioPlayer));
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
