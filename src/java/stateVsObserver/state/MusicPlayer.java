package stateVsObserver.state;

public class MusicPlayer {
    private PlayerState state = new PlayingState(); // initial state

    public void setState(PlayerState state){
        this.state = state;
    }

    public void pressPlay(){
        state.pressPlay(this);
    }
}
