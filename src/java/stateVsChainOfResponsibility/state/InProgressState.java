package stateVsChainOfResponsibility.state;

public class InProgressState implements TicketState{
    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket is IN PROGRESS → working on resolution.");
        ticket.setState(new ResolvedState());
    }
}
