package stateVsMediator.mediator;

public class NorthTrafficLight extends TrafficLightColleague {
    public NorthTrafficLight(TrafficMediator mediator) {
        super("North Light", mediator);
    }

    public void turnGreen() {
        System.out.println(name + ": RED");
        mediator.notify(this,"GREEN");
    }
    @Override
    public void turnRed() {
        System.out.println(name + ": RED");
    }
}
