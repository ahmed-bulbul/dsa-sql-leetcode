package com.bulbul.streamapi.excercises;

import com.bulbul.streamapi.domain.Director;
import com.bulbul.streamapi.domain.Genre;

import java.util.List;

record DirectorGenresPair(Director director, List<Genre> genres) { }