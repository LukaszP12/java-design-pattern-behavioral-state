package stateVsObserver.observer;

public class EventLogger implements PlayerObserver{
    @Override
    public void onStateChange(String newState) {
        System.out.println("Log: Player changed state to " + newState);
    }
}
