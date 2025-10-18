package stateVsTemplate.state;

public class OrderContext {
    private OrderState state = new NewOrderState(); // default

    public void setState(OrderState state) {
        this.state = state;
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
