package com.bulbul.streamapi.excercises;

import com.bulbul.streamapi.dao.CityDao;
import com.bulbul.streamapi.dao.CountryDao;
import com.bulbul.streamapi.dao.InMemoryWorldDao;
import com.bulbul.streamapi.domain.City;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise5 {
    private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
    private static final CityDao cityDao = InMemoryWorldDao.getInstance();

    public static void main(String[] args) {
        // Find the highest populated capital city of each continent
        Function<ContinentCityPair, City> extractCity = ContinentCityPair::city;
        var highPopulatedCapitalCityOfEachContinent =
                countryDao.findAllCountries()
                        .stream()
                        .map(country -> new ContinentCityPair(country.getContinent(),cityDao.findCityById(country.getCapital())))
                        .filter(pair -> Objects.nonNull(pair.city()))
                        .collect(Collectors.groupingBy(ContinentCityPair::continent,Collectors.maxBy(Comparator.comparing(extractCity.andThen(City::getPopulation)))));
        highPopulatedCapitalCityOfEachContinent.forEach((continent,pair) -> System.out.printf("%s: %s\n",continent,pair.get().city()));
    }

}