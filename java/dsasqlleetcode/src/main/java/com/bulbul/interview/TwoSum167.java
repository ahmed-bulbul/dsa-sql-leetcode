package com.bulbul.interview;

public class TwoSum167 {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int count = twoSum(nums,target);
        System.out.println(count);
    }

    private static int twoSum(int[] nums, int target) {

        int l=0;
        int r = nums.length-1;
        int count =0;

        while(l<r){
            int sum = nums[l]+nums[r];

            if(sum <= target){
                count++;
            }
            l++;
            r--;
        }

        return count;
    }
}
