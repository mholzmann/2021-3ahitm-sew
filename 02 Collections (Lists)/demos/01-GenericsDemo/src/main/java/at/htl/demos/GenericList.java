package at.htl.demos;

import java.lang.reflect.Array;

public class GenericList<E> {
    // private E[] elements = (E[]) new Object[10];
    private E[] elements;
    private int size = 0;

    public void add(E element) {
        if (elements == null) {
            elements = (E[]) Array.newInstance(element.getClass(), 10);
        }
        elements[size++] = element;
    }

    public E get(int index) {
        return elements[index];
    }
}
