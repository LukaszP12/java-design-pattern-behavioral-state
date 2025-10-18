package stateVsMediator.state;

public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight() {
        state = new RedState();
    }

    public void setState(TrafficLightState state){
        this.state = state;
    }

    public void showSignal(){
        state.showSignal();
    }

    public void change(){
        state.change(this);
    }
}
