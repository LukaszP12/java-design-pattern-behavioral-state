package stateVsMediator.mediator;

public class EastTrafficLight extends TrafficLightColleague{
    public EastTrafficLight(TrafficMediator mediator) {
        super("East Light", mediator);
    }
    @Override
    public void turnGreen() {
        System.out.println(name + ": GREEN");
        mediator.notify(this,"GREEN");
    }

    @Override
    public void turnRed() {
        System.out.println(name + ": RED");
    }
}
