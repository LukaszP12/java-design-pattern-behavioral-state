package stateVsTemplate.template;

public class PhysicalOrder extends OrderProcessor{
    @Override
    protected void selectItem() {
        System.out.println("Selected a physical product from inventory.");
    }

    @Override
    protected void deliver() {
        System.out.println("Shipping physical product to address.");
    }
}
