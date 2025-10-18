package stateVsObserver.observer;

import java.util.ArrayList;
import java.util.List;

public class PlayerNotifier {
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
