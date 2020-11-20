package at.htl.demos;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class A_CreateStream {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3 };
        IntStream intStream = Arrays.stream(numbers);

        Collection<String> strings = List.of("a", "b", "c");
        Stream<String> stringStream = strings.stream();

        Stream<String> stringStream2 = Stream.of("x", "y", "z");

        Stream<Double> doubleStream = Stream.generate(Math::random);
    }
}
