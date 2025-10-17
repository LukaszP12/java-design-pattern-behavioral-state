package stateVsStrategy.state;

public class DeadState implements CharacterState{
    @Override
    public void move() {
        System.out.println("Cannot move, character is dead.");
    }

    @Override
    public void attack() {
        System.out.println("Cannot attack, character is dead.");
    }
}
