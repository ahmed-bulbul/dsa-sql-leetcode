package com.bulbul.leetcode150;

import java.util.Arrays;

public class TwoSumII {

    public static void main(String[] args) {
       int[] numbers = {2,7,11,15};
       int target = 8;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }


    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[] { i + 1, j + 1 };
            }

            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{};
    }
}

