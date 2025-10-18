package stateVsTemplate.state;

public class StateDemo {
    public static void main(String[] args) {
        OrderContext order = new OrderContext();
        order.printStatus();
        order.nextState();

        order.printStatus();
        order.nextState();

        order.printStatus();
    }
}
