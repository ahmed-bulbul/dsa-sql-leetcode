package com.bulbul.streamapi.excercises;

import com.bulbul.streamapi.service.InMemoryMovieService;
import com.bulbul.streamapi.service.MovieService;

import java.util.List;

public class Exercise7 {
    private static final MovieService movieService = InMemoryMovieService.getInstance();

    public static void main(String[] args) {
        // Find the list of movies having the genres "Drama" and "Comedy" only
        var listOfGenreNames = List.of("Drama", "Comedy");
        var listOfGenres = listOfGenreNames.stream().map(movieService::findGenreByName).toList();
        var moviesInDramaAndComedyOnly =
                movieService.findAllMovies()
                        .stream()
                        .filter( movie -> movie.getGenres().size() == 2)
                        .filter( movie -> movie.getGenres().containsAll(listOfGenres))
                        .toList();
        moviesInDramaAndComedyOnly.forEach(movie -> System.out.printf("%s %s\n",movie,movie.getGenres()));
    }

}