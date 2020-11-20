package at.htl.demos;

import at.htl.model.Movie;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class K_Collect {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        List<Movie> list = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toList());

        List<Movie> unmodifiableList = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toUnmodifiableList());

        Set<Movie> set = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.toSet());
    }
}
