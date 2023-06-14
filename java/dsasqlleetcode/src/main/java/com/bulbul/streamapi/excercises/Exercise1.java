package com.bulbul.streamapi.excercises;

import com.bulbul.streamapi.domain.Director;
import com.bulbul.streamapi.domain.Movie;
import com.bulbul.streamapi.service.InMemoryMovieService;
import com.bulbul.streamapi.service.MovieService;
import com.bulbul.streamapi.util.ConvertToJson;

import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// Find the number of movies of each director
public class Exercise1 {

    private static final MovieService movieService = InMemoryMovieService.getInstance();

    public static void main(String[] args) {
        final Collection<Movie> movies = movieService.findAllMovies();
        System.out.println(movies.size());

        //find number of movies of each director
        Map<String,Long> dirMovies =
                movies.stream().map(Movie::getDirectors).flatMap(Collection::stream)
                        .collect(Collectors.groupingBy(Director::getName,Collectors.counting()));

        // Convert the Map to JSON
        String json = ConvertToJson.mapToJson(dirMovies);
        // Print the JSON
        System.out.println(json);
        System.out.println();
    }

}
