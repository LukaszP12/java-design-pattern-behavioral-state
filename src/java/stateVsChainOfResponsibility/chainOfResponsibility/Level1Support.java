package stateVsChainOfResponsibility.chainOfResponsibility;

public class Level1Support extends SupportHandler {
    @Override
    public void handleRequest(String issue) {
        if (issue.equals("password reset")) {
            System.out.println("Level 1 handled: " + issue);
        } else {
            System.out.println("Level 1 passing to next...");
            next.handleRequest(issue);
        }
    }
}
