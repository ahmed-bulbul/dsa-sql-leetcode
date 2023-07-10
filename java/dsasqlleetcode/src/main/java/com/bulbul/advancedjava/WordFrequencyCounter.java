package com.bulbul.advancedjava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCounter {


    //imparative approach
    static Map<String,Long> countFrequency(List<String> words){
        Map<String,Long> frequencyMap = new HashMap<>();

        for(String word : words){
            if(!frequencyMap.containsKey(word)){
                frequencyMap.put(word,1L);
            }else{
                Long oldCount = frequencyMap.get(word);
                frequencyMap.put(word,oldCount+1);
            }
        }
        return frequencyMap;
    }

    //functional way
    static Map<String,Long> countFrequency2(List<String> words){
        Map<String,Long> frequencyMap = new HashMap<>();
        for(String word: words){
            frequencyMap.merge(word,1L,(oldValue,value) -> oldValue + value);
        }
        return frequencyMap;
    }

    //Using stream
    static Map<String,Long> countFrequency3(List<String> words){
        return words.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),Collectors.counting()));
    }


    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello","World","Hello","Dhaka","Java","Lambda");
        Map<String,Long> wordFrequency = countFrequency3(words);
        System.out.println(wordFrequency);
    }
}
