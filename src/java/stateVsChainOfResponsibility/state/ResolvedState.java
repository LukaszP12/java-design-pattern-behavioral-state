package stateVsChainOfResponsibility.state;

public class ResolvedState implements TicketState{
    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket is RESOLVED → no further action.");
    }
}
