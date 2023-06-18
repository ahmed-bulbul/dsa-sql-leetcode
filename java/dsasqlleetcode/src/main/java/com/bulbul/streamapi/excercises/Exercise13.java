package com.bulbul.streamapi.excercises;
import com.bulbul.streamapi.dao.InMemoryWorldDao;
import com.bulbul.streamapi.dao.WorldDao;
import com.bulbul.streamapi.util.CountrySummaryStatistics;
import static java.lang.Long.compare;

import java.util.function.Supplier;
public class Exercise13 {
    private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

    private static final Supplier<CountrySummaryStatistics> countrySummaryStatisticsSupplier =
            () -> new CountrySummaryStatistics((l, r) -> compare(l.getPopulation(), r.getPopulation()));

    public static void main(String[] args) {
        // Find the countries with the minimum and the maximum population
        var countrySummaryStatistics =
                worldDao.findAllCountries()
                        .stream()
                        .collect(countrySummaryStatisticsSupplier, CountrySummaryStatistics::accept, CountrySummaryStatistics::combine);
        System.out.println(countrySummaryStatistics);
    }

}