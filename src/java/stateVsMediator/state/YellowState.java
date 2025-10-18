package stateVsMediator.state;

public class YellowState implements TrafficLightState{
    @Override
    public void showSignal() {
        System.out.println("YELLOW: Caution");
    }
    @Override
    public void change(TrafficLight light) {
        light.setState(new RedState());
    }
}
