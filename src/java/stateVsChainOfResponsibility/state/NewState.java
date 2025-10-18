package stateVsChainOfResponsibility.state;

public class NewState implements TicketState{
    @Override
    public void handle(Ticket ticket) {
        System.out.println("Ticket is NEW → assigning to support agent.");
        ticket.setState(new InProgressState());
    }
}
