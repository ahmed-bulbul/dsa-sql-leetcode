package com.bulbul.string;

import java.util.Arrays;
import java.util.List;

public class SubArray {

    public static void main(String[] args)
    {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        printAllSubarrays(input);
    }

    private static void printAllSubarrays(List<Integer> input) {
        for(int i=0;i<input.size();i++){
            for(int j=i;j<input.size();j++){
                System.out.println(input.subList(i,j+1));
            }
        }
    }
}
