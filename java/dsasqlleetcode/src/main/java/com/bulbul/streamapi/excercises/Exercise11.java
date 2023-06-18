package com.bulbul.streamapi.excercises;

import com.bulbul.streamapi.dao.InMemoryWorldDao;
import com.bulbul.streamapi.dao.WorldDao;
import com.bulbul.streamapi.domain.Country;

import static java.util.stream.Collectors.summarizingLong;

public class Exercise11 {
    private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

    public static void main(String[] args) {
        // Find the minimum, the maximum and the average population of world countries
        var populationSummary =
                worldDao.findAllCountries()
                        .stream()
                        .collect(summarizingLong(Country::getPopulation));
        System.out.println(populationSummary);
    }

}