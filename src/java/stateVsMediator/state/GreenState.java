package stateVsMediator.state;

public class GreenState implements TrafficLightState{
    @Override
    public void showSignal() {
        System.out.println("GREEN: Go");
    }

    @Override
    public void change(TrafficLight light) {
        light.setState(new YellowState());
    }
}
