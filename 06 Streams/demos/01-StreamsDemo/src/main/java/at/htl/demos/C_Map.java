package at.htl.demos;

import at.htl.model.Movie;

import java.util.List;

public class C_Map {

    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 15)
        );

        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .map(Movie::getTitle)
                .forEach(System.out::println);

        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .mapToInt(Movie::getLikes)
                .forEach(System.out::println);
    }
}
