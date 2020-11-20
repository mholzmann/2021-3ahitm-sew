package at.htl.demos;

import at.htl.model.Movie;

import java.util.List;

public class F_Distinct {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("b", 20),
                new Movie("c", 15),
                new Movie("a", 10),
                new Movie("b", 20)
        );

        movies.stream()
                .map(Movie::getTitle)
                .distinct()
                .forEach(System.out::println);
    }
}
