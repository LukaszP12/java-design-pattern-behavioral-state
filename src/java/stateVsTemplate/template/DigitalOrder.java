package stateVsTemplate.template;

public class DigitalOrder extends OrderProcessor{
    @Override
    protected void selectItem() {
        System.out.println("Selected a digital product.");
    }

    @Override
    protected void deliver() {
        System.out.println("Delivering digital product via email.");
    }
}
