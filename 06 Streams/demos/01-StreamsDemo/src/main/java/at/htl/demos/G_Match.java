package at.htl.demos;

import at.htl.model.Movie;

import java.util.List;

public class G_Match {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        // checks whether any element matches the given predicate
        boolean anyMatch = movies.stream()
                .anyMatch(movie -> movie.getLikes() > 10);
        System.out.println(anyMatch);

        // checks whether all elements match the given predicate
        boolean allMatch = movies.stream()
                .allMatch(movie -> movie.getLikes() > 10);
        System.out.println(allMatch);

        // checks whether no element matches the given predicate
        boolean noneMatch = movies.stream()
                .noneMatch(movie -> movie.getLikes() > 10);
        System.out.println(noneMatch);
    }
}
