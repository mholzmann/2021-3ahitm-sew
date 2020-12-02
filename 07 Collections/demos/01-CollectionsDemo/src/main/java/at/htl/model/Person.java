package at.htl.model;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        if (!name.equals(other.name)) {
            return name.compareTo(other.name);
        } else {
            return Integer.compare(age, other.age);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                name.equals(person.name);
    }

    /**
     * Without this method, e.g. HashSet wouldn't work as expected
     * @return hash code of person
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
