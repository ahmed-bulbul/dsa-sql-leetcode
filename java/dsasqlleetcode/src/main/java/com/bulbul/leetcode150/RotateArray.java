package com.bulbul.leetcode150;

public class RotateArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k=3;
        rotateArray(nums,k);
        printArray(nums);
    }

    private static void printArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

    private static void rotateArray(int[] nums,int k) {
        for(int i=0;i<k;i++){
            int temp = nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j] = nums[j-1];
            }
            nums[0]=temp;
        }
    }
}
