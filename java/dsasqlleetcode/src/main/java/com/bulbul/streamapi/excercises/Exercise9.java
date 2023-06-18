package com.bulbul.streamapi.excercises;

import com.bulbul.streamapi.dao.InMemoryWorldDao;
import com.bulbul.streamapi.dao.WorldDao;
import com.bulbul.streamapi.domain.Country;

import static java.lang.System.out;
import static java.util.Comparator.comparingDouble;

import java.util.Comparator;
import java.util.function.Predicate;

public class Exercise9 {
    private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

    private static final Comparator<Country> populationDensityComparator = comparingDouble(country -> country.getPopulation() / country.getSurfaceArea());
    private static final Predicate<Country> livesNobody = country -> country.getPopulation() == 0L;

    public static void main(String[] args) {
        // Sort the countries by their population densities in descending order ignoring
        // zero population countries
        var countries = worldDao.findAllCountries();
        var countriesSortedByPopulationDensityDescOrder =
                countries.stream()
                        .filter(livesNobody.negate())
                        .sorted(populationDensityComparator.reversed())
                        .toList();
        countriesSortedByPopulationDensityDescOrder.forEach(out::println);
    }

}