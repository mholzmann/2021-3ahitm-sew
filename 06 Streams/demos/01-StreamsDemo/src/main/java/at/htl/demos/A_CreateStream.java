package at.htl.demos;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A_CreateStream {

    public static void main(String[] args) {

        // Create a stream based on an array
        int[] numbers = { 1, 2, 3 };
        IntStream intStream = Arrays.stream(numbers);

        // Create a stream based on a collection
        Collection<String> strings = List.of("a", "b", "c");
        Stream<String> stringStream = strings.stream();

        // Create a stream of the given objects
        Stream<String> stringStream2 = Stream.of("x", "y", "z");

        // Create a stream of random numbers
        Stream<Double> doubleStream = Stream.generate(Math::random);
    }
}
