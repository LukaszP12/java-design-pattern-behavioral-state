package stateVsTemplate.state;

public class DeliveredState implements OrderState {
    @Override
    public void next(OrderContext order) {
        System.out.println("Order already delivered.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order delivered to customer.");
    }
}
