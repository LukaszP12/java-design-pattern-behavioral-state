package statePatternExample;

public class StatePatternDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.pressButton();
        machine.insertCoin();
        machine.pressButton();
        machine.dispense();
    }
}
