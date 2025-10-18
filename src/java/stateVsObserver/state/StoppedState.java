package stateVsObserver.state;

public class StoppedState implements PlayerState{
    @Override
    public void pressPlay(MusicPlayer player) {
        System.out.println("Starting music...");
        player.setState(new PlayingState());
    }
}
