package stateVsChainOfResponsibility.state;

public class Ticket {
    private TicketState state;

    public Ticket() {
        state = new NewState();
    }

    public void setState(TicketState state) {
        this.state = state;
    }

    public void nextState() {
        state.handle(this);
    }
}
