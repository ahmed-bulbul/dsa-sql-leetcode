package com.bulbul.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortExample {

    public static void main(String[] args) {

        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Bulbul","456432",18));
        emps.add(new Emp("Sakib","456432",15));
        emps.add(new Emp("Tamim","456444432",135));

        System.out.println(emps);

        Collections.sort(emps,new IdComparator());

        ArrayList<Emp> emps1 = new ArrayList<>(emps);
        Collections.sort(emps1,new NameComparator());

        //Comparable
        System.out.println(emps1);

        //Get Second Heighest Salary
//        List<Emp> = emps1.stream()
//                .sorted(Comparator.comparingDouble(Emp::getSalary).reversed()).collect(Collectors.toList());



    }
}
