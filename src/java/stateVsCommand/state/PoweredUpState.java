package stateVsCommand.state;

class PoweredUpState implements State{
    @Override
    public void attack() {
        System.out.println("POWERFUL attack!!! 🔥");
    }
}

