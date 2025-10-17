package stateVsStrategy.state;

public class HealthyState implements CharacterState{
    @Override
    public void move() {
        System.out.println("Running fast!");
    }

    @Override
    public void attack() {
        System.out.println("Attacks powerfully!");
    }
}
