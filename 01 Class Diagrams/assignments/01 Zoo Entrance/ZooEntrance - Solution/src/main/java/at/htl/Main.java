package at.htl;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        Entrance entrance = new Entrance();
        entrance.addTicket(new GroupTicket(6));
        entrance.addTicket(new AdultTicket());
        entrance.addTicket(new AdultTicket());
        entrance.addTicket(new ChildTicket());
        entrance.addTicket(new ChildTicket());
        entrance.addTicket(new ChildTicket());

        System.out.println("Visitors: " + entrance.computeVisitors());
        // System.out.println("Turnover: " + entrance.computeTurnover() + " Euro");
        System.out.println("Turnover: " + formatMoney(entrance.computeTurnover()));
    }

    private static String formatMoney(double money) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        return numberFormat.format(money);
    }
}
