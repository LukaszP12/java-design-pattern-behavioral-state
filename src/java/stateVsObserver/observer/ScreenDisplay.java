package stateVsObserver.observer;

public class ScreenDisplay implements PlayerObserver {
    @Override
    public void onStateChange(String newState) {
        System.out.println("Screen updated: Player is now " + newState);
    }
}
