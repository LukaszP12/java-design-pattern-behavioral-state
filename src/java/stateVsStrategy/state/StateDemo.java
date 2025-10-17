package stateVsStrategy.state;

public class StateDemo {
    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter();

        hero.move();
        hero.attack();

        hero.setState(new InjuredState());
        hero.move();
        hero.attack();

        hero.setState(new DeadState());
        hero.move();
        hero.attack();
    }
}
