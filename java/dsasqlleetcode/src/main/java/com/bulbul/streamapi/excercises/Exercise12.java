package com.bulbul.streamapi.excercises;

import com.bulbul.streamapi.dao.InMemoryWorldDao;
import com.bulbul.streamapi.dao.WorldDao;
import com.bulbul.streamapi.domain.Country;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summarizingLong;

import java.util.LongSummaryStatistics;
import java.util.function.BiConsumer;


public class Exercise12 {
    private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

    private static final BiConsumer<String, LongSummaryStatistics> printEntry = (continent, statistics) -> System.out.printf("%s: %s\n", continent, statistics);

    public static void main(String[] args) {
        // Find the minimum, the maximum and the average population of each continent.
        var populationSummaryByContinent =
                worldDao.findAllCountries()
                        .stream()
                        .collect(groupingBy(Country::getContinent, summarizingLong(Country::getPopulation)));
        populationSummaryByContinent.forEach(printEntry);
    }

}