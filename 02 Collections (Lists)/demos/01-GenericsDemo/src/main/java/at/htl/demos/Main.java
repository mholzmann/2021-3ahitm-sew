package at.htl.demos;

public class Main {

    public static void main(String[] args) {
        GenericList<String> list = new GenericList<String>();
        list.add("Jane");
        list.add("Joe");
        list.add("John");
        String second = list.get(1);
        System.out.println(second);
    }
}
