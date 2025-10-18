package stateVsMediator.state;

public class RedState implements TrafficLightState {
    @Override
    public void showSignal() {
        System.out.println("RED: Stop");
    }
    @Override
    public void change(TrafficLight light) {
        light.setState(new GreenState());
    }
}
