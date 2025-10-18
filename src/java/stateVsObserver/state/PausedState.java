package stateVsObserver.state;

public class PausedState implements PlayerState{
    @Override
    public void pressPlay(MusicPlayer player) {
        System.out.println("Resuming music...");
        player.setState(new PlayingState());
    }
}
