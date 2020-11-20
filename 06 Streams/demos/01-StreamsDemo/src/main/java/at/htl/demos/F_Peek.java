package at.htl.demos;

import at.htl.model.Movie;

import java.util.List;

public class F_Peek {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        // peek() is an intermediate operation (returns a stream)
        // foreach() is a terminal operation
        movies.stream()
                .peek(movie -> System.out.println("piped: " + movie))
                .filter(movie -> movie.getLikes() < 20)
                .peek(movie -> System.out.println("filtered: " + movie))
                .map(Movie::getTitle)
                .forEach(title -> System.out.println("mapped: " + title));
    }
}
