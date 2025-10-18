package stateVsTemplate.template;

public class TemplateDemo {
    public static void main(String[] args) {
        OrderProcessor order1 = new PhysicalOrder();
        order1.processOrder();

        OrderProcessor order2 = new DigitalOrder();
        order2.processOrder();
    }
}
