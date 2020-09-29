package at.htl;

public class AdultTicket extends Ticket {

    public AdultTicket() {
        super(14.7);
    }

    @Override
    public int getPersonCount() {
        return 1;
    }
}
