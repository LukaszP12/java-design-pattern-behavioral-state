package stateVsChainOfResponsibility.state;

public class StateDemo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        ticket.nextState(); // NEW -> IN_PROGRESS
        ticket.nextState(); // IN_PROGRESS -> RESOLVED
        ticket.nextState(); // stays resolved
    }
}
