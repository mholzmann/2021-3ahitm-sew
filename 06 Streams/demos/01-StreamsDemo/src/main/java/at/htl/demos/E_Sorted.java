package at.htl.demos;

import at.htl.model.Movie;

import java.util.Comparator;
import java.util.List;

public class E_Sorted {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        movies.stream()
                .sorted(Comparator.comparingInt(Movie::getLikes).reversed())
                .map(Movie::getTitle)
                .forEach(System.out::println);

        System.out.println();
    }
}
