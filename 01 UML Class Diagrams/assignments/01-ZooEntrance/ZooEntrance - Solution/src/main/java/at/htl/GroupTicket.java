package at.htl;

public class GroupTicket extends Ticket {
    private int personCount;

    public GroupTicket(int personCount) {
        super(50);
        this.personCount = personCount;
    }

    public int getPersonCount() {
        return personCount;
    }
}
