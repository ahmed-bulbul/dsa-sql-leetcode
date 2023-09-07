package com.bulbul.array;

import java.util.*;
import java.util.stream.Collectors;

public class REMOVEdUPLICATE {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,2,4,6,3);

        Set<Integer> set = new HashSet<>();
        List<Integer> collect = list.stream().filter(i -> set.add(i)).collect(Collectors.toList());
        collect.forEach(s-> System.out.println(s));
    }
}
