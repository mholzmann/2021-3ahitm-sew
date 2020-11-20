package at.htl.demos;

import at.htl.model.Movie;

import java.util.List;
import java.util.function.Predicate;

public class B_Filter {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        long count = movies.stream()
                .filter(movie -> movie.getLikes() < 15)
                .count();
        System.out.println(count);

        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;
        movies.stream()
                .filter(isPopular)
                .forEach(movie -> System.out.println(movie.getTitle()));
    }
}
