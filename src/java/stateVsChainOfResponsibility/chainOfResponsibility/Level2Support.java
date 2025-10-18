package stateVsChainOfResponsibility.chainOfResponsibility;

public class Level2Support extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("software bug")) {
            System.out.println("Level 2 handled: " + issue);
        } else {
            System.out.println("Level 2 passing to next...");
            next.handleRequest(issue);
        }
    }
}
