package stateVsObserver.state;

public class PlayingState implements PlayerState {
    @Override
    public void pressPlay(MusicPlayer player) {
        System.out.println("Already playing. Pausing now...");
        player.setState(new PausedState());
    }
}
