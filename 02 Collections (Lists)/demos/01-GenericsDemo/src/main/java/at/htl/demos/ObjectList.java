package at.htl.demos;

public class ObjectList {
    private Object[] elements = new Object[10];
    private int size = 0;

    public void add(Object element) {
        elements[size++] = element;
    }

    public Object get(int index) {
        return elements[index];
    }
}
