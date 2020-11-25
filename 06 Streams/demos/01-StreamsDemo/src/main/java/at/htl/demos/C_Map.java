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

        // Print the titles of all movies with more than 10 likes
        movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .map(Movie::getTitle)
                .forEach(System.out::println);

        System.out.println();

        // Print all likes
        movies.stream()
                .mapToInt(Movie::getLikes)
                .forEach(System.out::println);
    }
}
