package at.htl.demos;

import at.htl.model.Movie;

import java.util.Comparator;
import java.util.List;

public class J_Reduce {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        // reduce() returns an Optional<T> because the stream could be empty
        int totalLikes = movies.stream()
                .map(Movie::getLikes)
                .reduce((a, b) -> a + b)
                .orElse(0);
        System.out.println(totalLikes);

        // if an identity-argument is passed, reduce() returns a value (instead of an Optional<T>)
        totalLikes = movies.stream()
                .mapToInt(Movie::getLikes)
                .reduce(0, (a, b) -> a + b);
        System.out.println(totalLikes);

        // before you using reduce(), look for a built-in alternative
        totalLikes = movies.stream()
                .mapToInt(Movie::getLikes)
                .sum();
        System.out.println(totalLikes);
    }
}
