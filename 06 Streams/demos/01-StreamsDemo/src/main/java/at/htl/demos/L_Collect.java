package at.htl.demos;

import at.htl.model.Movie;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class L_Collect {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        // Get a list of all movies with more than 10 likes
        List<Movie> list = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toList());

        // Get an unmodifiable list of all movies with more than 10 likes
        List<Movie> unmodifiableList = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toUnmodifiableList());

        // Get a set of all movies with more than 10 likes
        Set<Movie> set = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toSet());
    }
}
