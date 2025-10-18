package stateVsChainOfResponsibility.chainOfResponsibility;

public class ChainDemo {
    public static void main(String[] args) {
        SupportHandler level1 = new Level1Support();
        SupportHandler level2 = new Level2Support();
        SupportHandler manager = new ManagerSupport();

        level1.setNext(level2);
        level2.setNext(manager);

        level1.handleRequest("password reset");
        level1.handleRequest("software bug");
        level1.handleRequest("server down");
    }
}
