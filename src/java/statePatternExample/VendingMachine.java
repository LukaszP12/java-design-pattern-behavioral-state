package statePatternExample;

public class VendingMachine {
    private State noCoinState;
    private State hasCoinState;
    private State dispensingState;
    private State currentState;

    public VendingMachine() {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        dispensingState =  new DispensingState(this);

        currentState = noCoinState;
    }

    public void setState(State state){
        this.currentState = state;
    }

    public State getNoCoinState() { return noCoinState; }
    public State getHasCoinState() { return hasCoinState; }
    public State getDispensingState() { return dispensingState; }

    // Delegate to current state
    public void insertCoin() {
        currentState.insertCoin();
    }

    public void pressButton() {
        currentState.pressButton();
    }

    public void dispense() {
        currentState.dispense();
    }
}
