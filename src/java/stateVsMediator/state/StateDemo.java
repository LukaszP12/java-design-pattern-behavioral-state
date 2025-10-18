package stateVsMediator.state;

public class StateDemo {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        light.showSignal(); // RED
        light.change();

        light.showSignal(); // GREEN
        light.change();

        light.showSignal(); // YELLOW
    }
}
