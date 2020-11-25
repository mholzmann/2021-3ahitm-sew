package at.htl.demos;

import at.htl.model.Movie;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class D_Skip_Limit {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15),
                new Movie("d", 25),
                new Movie("e", 30),
                new Movie("f", 5)
        );

        // Print second, third and fourth movie
        movies.stream()
                .skip(1)
                .limit(3)
                .forEach(System.out::println);

        System.out.println();

        // Print all movies, except the third one
        Stream.concat(movies.stream().limit(2),
                      movies.stream().skip(3))
                .forEach(System.out::println);
    }
}
