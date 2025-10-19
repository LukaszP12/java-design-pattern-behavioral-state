package stateVsCommand.state;

public class StateDemo {
    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter();

        hero.attack();
        hero.setState(new PoweredUpState());
        hero.attack();
    }
}
