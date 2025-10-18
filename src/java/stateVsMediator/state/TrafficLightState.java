package stateVsMediator.state;

public interface TrafficLightState {
    void change(TrafficLight context);
    void showSignal();
}
