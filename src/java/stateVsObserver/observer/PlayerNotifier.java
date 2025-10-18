package stateVsObserver.observer;

import java.util.ArrayList;
import java.util.List;

public class PlayerNotifier {
    // Yes, Notifier knows it has observers, but it does NOT depend on their concrete types.
    // So it's still loosely coupled — it only knows them as PlayerObserver objects, not who they really are.
    private List<PlayerObserver> observers = new ArrayList<>();

    public void addObserver(PlayerObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String newState) {
        for (PlayerObserver observer : observers) {
            observer.onStateChange(newState);
        }
    }
}
