package stateVsMediator.mediator;

public interface TrafficMediator {
    void notify(TrafficLightColleague sender, String event);
}
