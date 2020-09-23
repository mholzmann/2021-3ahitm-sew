package at.htl.demos;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // List<String> list = new LinkedList<>();

        addElements(list);
        list.set(0, "X");
        list.remove(1);
        list.remove("D");

        System.out.println(list);
    }

    private static void addElements(List<String> list) {
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
    }
}
