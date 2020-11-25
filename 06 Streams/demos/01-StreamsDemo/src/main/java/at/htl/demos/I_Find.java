package at.htl.demos;

import at.htl.model.Movie;

import java.util.List;

public class I_Find {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        // Find first movie with more than 10 likes
        // orElseThrow() throws a NoSuchElementException, if there is no such movie present
        Movie first = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .findFirst()
                .orElseThrow();
        System.out.println(first);

        // Find any movie with more than 10 likes
        // orElse(null) returns null, if there is no such movie present
        Movie any = movies.parallelStream()
                .filter(movie -> movie.getLikes() > 10)
                .findAny()
                .orElse(null);
        System.out.println(any);
    }
}
