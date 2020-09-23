package at.htl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Entrance {
    private Collection<Ticket> tickets = new ArrayList<>();

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public double computeTurnover() {
        double turnover = 0;
        for (Ticket ticket : tickets) {
            turnover += ticket.getPrice();
        }
        return turnover;
    }

    public int computeVisitors() {
        int visitors = 0;
        for (Ticket ticket : tickets) {
            visitors += ticket.getPersonCount();
        }
        return visitors;
    }
}
