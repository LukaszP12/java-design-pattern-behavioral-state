package stateVsStrategy.state;

public class InjuredState implements CharacterState{
    @Override
    public void move() {
        System.out.println("Moving slowly...");
    }

    @Override
    public void attack() {
        System.out.println("Weak attack...");
    }
}
