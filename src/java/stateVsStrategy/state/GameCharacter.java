package stateVsStrategy.state;

public class GameCharacter {
    private CharacterState state;

    public GameCharacter() {
        state = new HealthyState();
    }

    public void setState(CharacterState state){
        this.state = state;
    }

    public void move(){
        state.move();
    }

    public void attack(){
        state.attack();
    }
}
