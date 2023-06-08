package com.bulbul.array.string;

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


    private static void printAllSubarrays2(List<Integer> input) {

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<input.size();i++){
            for(int j=i;j<input.size();j++){
                // System.out.println(input.subList(i,j+1));
                // Append the current element to the StringBuilder
                sb.append(input.get(j)).append(" ");

                // Print the subarray
                System.out.println(sb.toString());
            }

            // Clear the StringBuilder for the next subarray
            sb.setLength(0);
        }
    }
}
