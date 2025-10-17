package statePatternExample;

public class DispensingState implements State{
    private VendingMachine machine;

    public DispensingState(VendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait, already dispensing.");
    }

    @Override
    public void pressButton() {
        System.out.println("Dispensing in progress...");
    }

    @Override
    public void dispense() {
        System.out.println("Item dispensed.");
        machine.setState(machine.getNoCoinState());
    }
}
