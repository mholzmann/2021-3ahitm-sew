package at.htl.demos;

import at.htl.model.Movie;

import java.util.Comparator;
import java.util.List;

public class J_Min_Max {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        // Find the movie with the most likes
        Movie topRated = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .orElseThrow();
        System.out.println(topRated);

        // Find the movie with the fewest likes
        Movie worstRated = movies.stream()
                .min(Comparator.comparing(Movie::getLikes))
                .orElseThrow();
        System.out.println(worstRated);
    }
}
