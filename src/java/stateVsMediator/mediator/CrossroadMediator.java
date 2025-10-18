package stateVsMediator.mediator;

public class CrossroadMediator implements TrafficMediator {
    private NorthTrafficLight northLight;
    private EastTrafficLight eastLight;

    public void setNorthLight(NorthTrafficLight northLight) {
        this.northLight = northLight;
    }

    public void setEastLight(EastTrafficLight eastLight) {
        this.eastLight = eastLight;
    }

    @Override
    public void notify(TrafficLightColleague sender, String event) {
        if (sender == northLight && event.equals("GREEN")) {
            eastLight.turnRed();
        } else if (sender == eastLight && event.equals("GREEN")) {
            northLight.turnRed();
        }
    }
}
