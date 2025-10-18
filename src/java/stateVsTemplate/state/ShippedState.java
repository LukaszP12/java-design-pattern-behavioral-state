package stateVsTemplate.state;

public class ShippedState implements OrderState {
    @Override
    public void next(OrderContext order) {
        order.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order shipped.");
    }
}
