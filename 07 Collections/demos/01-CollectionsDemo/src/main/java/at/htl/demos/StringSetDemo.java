package at.htl.demos;

import java.util.*;

public class StringSetDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("b", "a", "d"));
        list.add("a");
        list.add("c");
        System.out.println("List: " + list);

        // Save unique Strings in a HashSet (no special order is guaranteed)
        Set<String> hashSet = new HashSet<>(List.of("b", "a", "d"));
        hashSet.add("a"); // not added because already in set
        hashSet.add("c"); // added
        System.out.println("HashSet: " + hashSet);

        // Save unique Strings in a TreeSet (automatically sorted in natural order)
        Set<String> treeSet = new TreeSet<>(List.of("b", "a", "d"));
        treeSet.add("a"); // not added, because already in set
        treeSet.add("c"); // added
        System.out.println("TreeSet: " + treeSet);
    }
}
