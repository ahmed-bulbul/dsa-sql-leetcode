package com.bulbul.leetcode;

import java.util.Arrays;

public class SlidingWindowTechnique {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k =3;

        System.out.println(Arrays.toString(slidingWindow(arr,k)));


    }

    public static int[] slidingWindow(int[] arr, int k){

        int len = arr.length;
        int currSum=0;

        for(int i=0;i<k;i++){
            currSum = currSum+arr[i];
        }

        int[] result = new int[len - k +1];
        result[0]=currSum;

        for(int i=1;i<len-k +1; i++){
            currSum = currSum - arr[i-1] + arr[i + k -1];
            result[i]=currSum;
        }

        return result;
    }
}
