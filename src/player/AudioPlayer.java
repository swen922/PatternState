package player;

import state.State;
import state.StateReady;

import java.util.ArrayList;
import java.util.List;

public class AudioPlayer {

    private State state;
    private boolean play = false;

    private int volume = 20;
    private List<String> playlist = new ArrayList<>();
    private String currentSong;

    public AudioPlayer() {
        this.state = new StateReady(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void clickLock() {
        state.clickLock();
    }

    public void clickPlay() {
        state.clickPlay();
    }

    public void clickNext() {
        state.clickNext();
    }

    public void clickPrevious() {
        state.clickPrevious();
    }



    public boolean isPlaying() {
        return play;
    }

    public void startPlay() {
        this.play = true;
        System.out.println("Start playing");
    }

    public void stopPlay() {
        this.play = false;
        System.out.println("Stop playing");
    }

    public void nextSong() {
        System.out.println("go to next song");
    }

    public void previousSong() {
        System.out.println("go to previous song");
    }


}
