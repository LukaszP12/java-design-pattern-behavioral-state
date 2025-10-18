package stateVsMediator.mediator;

public abstract class TrafficLightColleague {
    protected TrafficMediator mediator;
    protected String name;

    public TrafficLightColleague(String name,TrafficMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void turnGreen();
    public abstract void turnRed();
}
