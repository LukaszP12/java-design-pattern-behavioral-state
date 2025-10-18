package stateVsObserver.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        PlayerNotifier notifier = new PlayerNotifier();
        notifier.addObserver(new ScreenDisplay());
        notifier.addObserver(new EventLogger());

        notifier.notifyObservers("PLAYING");
        notifier.notifyObservers("PAUSED");
    }
}
