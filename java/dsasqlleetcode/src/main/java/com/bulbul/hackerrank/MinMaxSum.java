package com.bulbul.hackerrank;

import java.util.Arrays;

public class MinMaxSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        findMinMaxSum(arr);
    }

    public static void findMinMaxSum(int[] arr) {
        Arrays.sort(arr);
        long minSum = 0;
        long maxSum = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            minSum += arr[i];
            maxSum += arr[i + 1];
        }

        System.out.println(minSum + " " + maxSum);
    }
}