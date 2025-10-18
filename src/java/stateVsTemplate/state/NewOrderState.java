package stateVsTemplate.state;

public class NewOrderState implements OrderState {
    @Override
    public void next(OrderContext order) {
        order.setState(new ShippedState());
    }

    @Override
    public void printStatus() {
        System.out.println("Order placed. Awaiting shipment.");
    }
}
