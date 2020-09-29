package at.htl.demos;

public class IntegerList {
    private int[] elements = new int[10];
    private int size = 0;

    public void add(int element) {
        elements[size++] = element;
    }

    public int get(int index) {
        return elements[index];
    }
}
