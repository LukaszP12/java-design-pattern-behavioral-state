package stateVsTemplate.state;

public interface OrderState {
    void next(OrderContext order);
    void printStatus();
}
