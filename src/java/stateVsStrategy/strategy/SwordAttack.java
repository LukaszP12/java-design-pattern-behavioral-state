package stateVsStrategy.strategy;

public class SwordAttack implements AttackStrategy{
    @Override
    public void attack() {
        System.out.println("Attacks with a sword!");
    }
}
