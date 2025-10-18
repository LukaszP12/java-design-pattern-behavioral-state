package stateVsTemplate.template;

public abstract class OrderProcessor {
    public final void processOrder() {
        selectItem();
        makePayment();
        deliver();
    }

    protected abstract void selectItem();
    protected abstract void deliver();

    protected void makePayment() {
        System.out.println("Payment done via credit card.");
    }
}
