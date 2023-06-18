package com.bulbul.streamapi.excercises;

import com.bulbul.streamapi.dao.InMemoryWorldDao;
import com.bulbul.streamapi.dao.WorldDao;
import com.bulbul.streamapi.domain.Country;
import com.bulbul.streamapi.util.DoubleSummaryGaussianStatistics;

public class Exercise17 {
    private static final WorldDao worldDao = InMemoryWorldDao.getInstance();

    public static void main(String[] args) {
        // Find the minimum, the maximum, the average, and the standard deviation of GNP values.
        var gnpStatistics =
                worldDao.findAllCountries()
                        .stream()
                        .mapToDouble(Country::getGnp)
                        .collect(
                                DoubleSummaryGaussianStatistics::new,
                                DoubleSummaryGaussianStatistics::accept,
                                DoubleSummaryGaussianStatistics::combine
                        );
        System.out.println(gnpStatistics);
    }

}