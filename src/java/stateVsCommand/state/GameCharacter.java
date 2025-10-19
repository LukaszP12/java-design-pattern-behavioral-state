package stateVsCommand.state;

class GameCharacter {
    private State state = new NormalState();

    public void setState(State state) {
        this.state = state;
    }

    public void attack() {
        state.attack();
    }
}
