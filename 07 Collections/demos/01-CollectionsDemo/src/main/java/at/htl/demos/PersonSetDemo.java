package at.htl.demos;

import at.htl.model.Person;

import java.util.*;

public class PersonSetDemo {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>(List.of(
                new Person("John", 24),
                new Person("Jane", 21),
                new Person("Joe", 64)
        ));
        list.add(new Person("Jane", 21));
        list.add(new Person("Jack", 48));
        System.out.println("List: " + list);

        // Save unique Persons in a HashSet (no special order is guaranteed)
        // Requirement: Person should override equals() and hashCode()
        Set<Person> hashSet = new HashSet<>(List.of(
                new Person("John", 24),
                new Person("Jane", 21),
                new Person("Joe", 64)
        ));
        hashSet.add(new Person("Jane", 21));   // not added, because already in set
        hashSet.add(new Person("Jack", 64));   // added
        System.out.println("HashSet: " + hashSet);

        // Save unique Persons in a TreeSet (automatically sorted in natural order)
        // Requirement: Person must implement Comparable
        Set<Person> treeSet = new TreeSet<>(List.of(
                new Person("John", 24),
                new Person("Jane", 21),
                new Person("Joe", 64)
        ));
        treeSet.add(new Person("Jane", 21));   // not added, because already in set
        treeSet.add(new Person("Jack", 48));   // added
        System.out.println("TreeSet: " + treeSet);
    }
}
