package state;

import player.AudioPlayer;

public abstract class State {

    protected AudioPlayer audioPlayer;

    public State(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    public abstract void clickLock();
    public abstract void clickPlay();
    public abstract void clickNext();
    public abstract void clickPrevious();
}
