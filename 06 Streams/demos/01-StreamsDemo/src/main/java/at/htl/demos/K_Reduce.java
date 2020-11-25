package at.htl.demos;

import at.htl.model.Movie;

import java.util.Comparator;
import java.util.List;

public class K_Reduce {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        // All pipelines below calculate the total sum of likes

        // reduce() returns an Optional<T> because the stream could be empty
        // So you have to call orElse() to actually get the sum
        int totalLikes = movies.stream()
                .map(Movie::getLikes)
                .reduce((a, b) -> a + b)
                .orElse(0);
        System.out.println(totalLikes);

        // If an identity-argument is passed, reduce() returns the actual result (instead of an Optional<T>)
        // So you don't have to call orElse()
        totalLikes = movies.stream()
                .mapToInt(Movie::getLikes)
                .reduce(0, (a, b) -> a + b);
        System.out.println(totalLikes);

        // Before you using reduce(), look for a built-in alternative like sum()
        totalLikes = movies.stream()
                .mapToInt(Movie::getLikes)
                .sum();
        System.out.println(totalLikes);
    }
}
