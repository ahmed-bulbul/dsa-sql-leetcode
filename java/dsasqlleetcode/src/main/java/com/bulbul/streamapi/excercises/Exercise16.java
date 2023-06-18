package com.bulbul.streamapi.excercises;

import com.bulbul.streamapi.dao.InMemoryWorldDao;
import com.bulbul.streamapi.dao.WorldDao;
import com.bulbul.streamapi.domain.Country;
import com.bulbul.streamapi.util.CountryCitySummaryStatistics;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

import static java.util.stream.Collector.of;
import static java.util.stream.Collectors.groupingBy;

public class Exercise16 {
    private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

    private static final BiConsumer<CountryCitySummaryStatistics, Country> accumulator = (s, c) -> s.accept(c);
    private static final BinaryOperator<CountryCitySummaryStatistics> combiner = (l, r) -> { l.combine(r); return l; };
    private static final BiConsumer<String, CountryCitySummaryStatistics> printEntry =
            (country,statistics) -> System.out.printf("%s: %s\n", country, statistics);

    public static void main(String[] args) {
        // Find the cities with the minimum and the maximum population in countries.
        var countryCityStatistics =
                worldDao.findAllCountries()
                        .stream()
                        .collect(groupingBy(Country::getCode, of(CountryCitySummaryStatistics::new, accumulator, combiner)));
        countryCityStatistics.forEach(printEntry);
    }
}