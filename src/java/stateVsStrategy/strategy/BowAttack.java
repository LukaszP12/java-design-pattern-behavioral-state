package stateVsStrategy.strategy;

public class BowAttack implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Shoots an arrow!");
    }
}
