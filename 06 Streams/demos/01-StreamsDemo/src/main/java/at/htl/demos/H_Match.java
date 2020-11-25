package at.htl.demos;

import at.htl.model.Movie;

import java.util.List;

public class H_Match {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        // Check whether any element has more than 10 likes
        boolean anyMatch = movies.stream()
                .anyMatch(movie -> movie.getLikes() > 10);
        System.out.println(anyMatch);

        // Check whether all elements have more than 10 likes
        boolean allMatch = movies.stream()
                .allMatch(movie -> movie.getLikes() > 10);
        System.out.println(allMatch);

        // Check whether no element has more than 10 likes
        boolean noneMatch = movies.stream()
                .noneMatch(movie -> movie.getLikes() > 10);
        System.out.println(noneMatch);
    }
}
