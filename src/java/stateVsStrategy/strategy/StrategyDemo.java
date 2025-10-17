package stateVsStrategy.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();

        warrior.setAttackStrategy(new SwordAttack());
        warrior.attack();

        warrior.setAttackStrategy(new BowAttack());
        warrior.attack();

        warrior.setAttackStrategy(new MagicAttack());
        warrior.attack();
    }
}
