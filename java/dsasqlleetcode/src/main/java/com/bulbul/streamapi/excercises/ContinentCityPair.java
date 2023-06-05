package com.bulbul.streamapi.excercises;

import com.bulbul.streamapi.domain.City;

import java.util.Optional;

public record ContinentCityPair(String continent, City city) implements Comparable<ContinentCityPair>{

    @Override
    public int compareTo(ContinentCityPair other) {
        return this.city.getPopulation()-other.city.getPopulation();
    }

    public static void printEntry(String continent, Optional<ContinentCityPair> pair) {
        System.out.printf("%s: %s\n",continent,pair.get().city());
    }

}