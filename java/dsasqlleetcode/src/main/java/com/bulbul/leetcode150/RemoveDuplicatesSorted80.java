package com.bulbul.leetcode150;

public class RemoveDuplicatesSorted80 {

    public static void main(String[] args) {

            int[] nums = {1,1,1,2,2,3};
        System.out.println(removeDuplicate(nums));

    }

    private static int removeDuplicate(int[] nums) {
        int i=0;
        for(int e : nums){
            if(i==0 || i==1 || nums[i-2]!=e){
                nums[i] = e;  // nums[0] = 1, nums[1]=1, i=2,,,, nums[2-2][0] = 1
                i++;
            }
        }
        return i;
    }
}
