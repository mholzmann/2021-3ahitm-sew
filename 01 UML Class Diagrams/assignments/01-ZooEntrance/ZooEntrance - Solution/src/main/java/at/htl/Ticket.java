package at.htl;

public abstract class Ticket {
    private double price;

    public Ticket(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public abstract int getPersonCount();
}