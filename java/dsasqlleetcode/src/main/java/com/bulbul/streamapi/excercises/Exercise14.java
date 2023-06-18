package com.bulbul.streamapi.excercises;
import com.bulbul.streamapi.dao.InMemoryWorldDao;
import com.bulbul.streamapi.dao.WorldDao;
import com.bulbul.streamapi.domain.Country;
import com.bulbul.streamapi.util.CountrySummaryStatistics;

import static java.util.stream.Collector.of;
import static java.util.stream.Collectors.groupingBy;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Exercise14 {
    private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

    private static final BiConsumer<String, CountrySummaryStatistics> printEntry =
            (continent, statistics) -> System.out.printf("%s: %s\n", continent, statistics);

    private static final BiConsumer<CountrySummaryStatistics, Country> accumulator = (a, c) -> a.accept(c);
    private static final BinaryOperator<CountrySummaryStatistics> combiner = (l, r) -> { l.combine(r);	return l; };
    private static final Supplier<CountrySummaryStatistics> countrySummaryStatisticsSupplier =
            () -> new CountrySummaryStatistics((l, r) -> Long.compare(l.getPopulation(), r.getPopulation()));

    public static void main(String[] args) {
        // Find the countries of each continent with the minimum and the maximum population
        var continentStatistics =
                worldDao.findAllCountries()
                        .stream()
                        .collect(groupingBy(Country::getContinent, of(countrySummaryStatisticsSupplier, accumulator, combiner)));
        continentStatistics.forEach(printEntry);
    }

}