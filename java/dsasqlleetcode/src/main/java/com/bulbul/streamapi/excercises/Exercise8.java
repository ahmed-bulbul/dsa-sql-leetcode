package com.bulbul.streamapi.excercises;

import com.bulbul.streamapi.domain.Movie;
import com.bulbul.streamapi.service.InMemoryMovieService;
import com.bulbul.streamapi.service.MovieService;

import java.util.stream.Collectors;

public class Exercise8 {
    private static final MovieService movieService = InMemoryMovieService.getInstance();

    public static void main(String[] args) {
        // Group the movies by the year and list them
        var moviesByYear =
                movieService.findAllMovies().stream()
                        .collect(Collectors.groupingBy(Movie::getYear));
        moviesByYear.forEach((year,movies) -> System.out.printf("%d: %s\n",year,movies));
    }

}