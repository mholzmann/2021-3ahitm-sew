package at.htl.demos;

import at.htl.model.Movie;

import java.util.List;

public class D_Skip_Limit {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15),
                new Movie("d", 25),
                new Movie("e", 30),
                new Movie("f", 5)
        );

        movies.stream()
                .skip(1)
                .limit(3)
                .map(Movie::getTitle)
                .forEach(System.out::println);

        System.out.println();

        movies.stream()
                .takeWhile(movie -> movie.getLikes() < 25)
                .map(Movie::getTitle)
                .forEach(System.out::println);
    }
}
