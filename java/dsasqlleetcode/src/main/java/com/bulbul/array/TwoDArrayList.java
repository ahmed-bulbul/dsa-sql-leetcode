package com.bulbul.array;

import java.util.ArrayList;
import java.util.List;

public class TwoDArrayList {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer> > arrLL = new ArrayList<>();

        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(0);
        firstList.add(1);
        firstList.add(2);
        firstList.add(3);

        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(4);
        secondList.add(5);
        secondList.add(6);
        secondList.add(7);

        arrLL.add(firstList);
        arrLL.add(secondList);

        System.out.println(arrLL);

    }
}
