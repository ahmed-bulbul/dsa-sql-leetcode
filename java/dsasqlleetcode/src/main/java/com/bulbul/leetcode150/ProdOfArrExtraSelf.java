package com.bulbul.leetcode150;

import java.util.Arrays;

public class ProdOfArrExtraSelf {

    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] arr =productExceptSelf(nums);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] productExceptSelf(int[] nums) {

        int[] res=new int[nums.length];

        int leftprod=1; //-1,1,0,-3,3

        for(int i=0;i<nums.length;i++){

            res[i]=leftprod;
            leftprod*=nums[i];
        }

        int rightprod=1;


        for(int i=nums.length-1;i>=0;i--){

            res[i]*=rightprod;
            rightprod*=nums[i];
        }
        return res;
    }

    private static int[] productExceptSelf2(int[] nums) {

        int[] res=new int[nums.length];

        int leftprod=1; //-1,1,0,-3,3

        for(int i=0;i<nums.length;i++){

            res[i]=leftprod;
            leftprod*=nums[i];
        }

        int rightprod=1;


        for(int i=nums.length-1;i>=0;i--){

            res[i]*=rightprod;
            rightprod*=nums[i];
        }
        return res;
    }
}
