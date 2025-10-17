package stateVsStrategy.strategy;

public class MagicAttack implements AttackStrategy {
    @Override
    public void attack() {
        System.out.println("Casts a fireball!");
    }
}
