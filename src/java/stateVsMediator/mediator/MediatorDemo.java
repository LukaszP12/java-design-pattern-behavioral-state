package stateVsMediator.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        CrossroadMediator mediator = new CrossroadMediator();

        NorthTrafficLight north = new NorthTrafficLight(mediator);
        EastTrafficLight east = new EastTrafficLight(mediator);

        mediator.setNorthLight(north);
        mediator.setEastLight(east);

        north.turnGreen();
        east.turnGreen();
    }
}
