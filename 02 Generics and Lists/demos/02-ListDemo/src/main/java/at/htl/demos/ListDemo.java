package at.htl.demos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        // Of course you could also use LinkedList instead
        // of ArrayList in the following examples!

        // Initially empty list
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list);

        // Unmodifiable list
        List<Integer> unmodifiableList = List.of(3, 2, 1);
        // unmodifiableList.add(0); // => UnsupportedOperationException
        System.out.println(unmodifiableList);

        // Modifiable list
        List<Integer> modifiableList = new ArrayList<>(List.of(6, 7, 8));
        modifiableList.add(9);
        modifiableList.set(0, 3);
        System.out.println(modifiableList);

        // Unmodifiable view of specified list
        List<Integer> listView = Collections.unmodifiableList(modifiableList);
        // unmodifiableListView.add(0); // => UnsupportedOperationException
        modifiableList.add(0);  // Changes in modifiableList are visible in listView.
        System.out.println(listView);

        // Collection is a superinterface of List.
        // Therefore you can also program against Collection,
        // if you don't need to access elements by index.
        Collection<Integer> collection = new ArrayList<>();
        collection.add(3);
        collection.add(4);
        collection.add(5);
        // collection.set(0, 10); // => not supported by Collection
        System.out.println(collection);
    }
}
