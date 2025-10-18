package stateVsChainOfResponsibility.state;

public interface TicketState {
    void handle(Ticket ticket);
}
