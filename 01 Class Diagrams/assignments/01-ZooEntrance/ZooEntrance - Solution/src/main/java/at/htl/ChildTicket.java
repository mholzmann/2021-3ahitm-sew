package at.htl;

public class ChildTicket extends Ticket {

    public ChildTicket() {
        super(0);
    }

    @Override
    public int getPersonCount() {
        return 1;
    }
}
