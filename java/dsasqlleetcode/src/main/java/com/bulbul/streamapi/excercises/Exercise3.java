package com.bulbul.streamapi.excercises;

import com.bulbul.streamapi.domain.Director;
import com.bulbul.streamapi.domain.Genre;
import com.bulbul.streamapi.service.InMemoryMovieService;
import com.bulbul.streamapi.service.MovieService;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise3 {
    private static final MovieService movieService = InMemoryMovieService.getInstance();

    public static void main(String[] args) {
        // Find the number of genres of each director's movies
        Map<Director, Map<Genre, Long>> directorGenreNumbers;
        directorGenreNumbers = movieService.findAllMovies()
                .stream()
                .map( movie -> movie.getDirectors().stream().map(director -> new DirectorGenresPair(director,movie.getGenres())).toList())
                .flatMap(Collection::stream)
                .map( directorGenres -> directorGenres.genres().stream().map( genre -> new DirectorGenrePair(directorGenres.director(),genre) ).toList())
                .flatMap(Collection::stream)
                .collect(Collectors.groupingBy(DirectorGenrePair::director,Collectors.groupingBy(DirectorGenrePair::genre,Collectors.counting())));
        directorGenreNumbers.forEach((director,genreCounts)->{
            System.out.printf("%s\n",director.getName());
            genreCounts.forEach( (genre,count) -> System.out.printf("\t%s: %s\n",genre.getName(),count));
        });

    }
}
