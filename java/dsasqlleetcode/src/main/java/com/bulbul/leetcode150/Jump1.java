package com.bulbul.leetcode150;

public class Jump1 {

    public static boolean canJump(int[] nums) {
        int boundary =0;
        for(int i=0;i<=boundary;i++){
            boundary = Math.max(boundary,i+nums[i]);
            if(boundary>=nums.length)
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        boolean b  = canJump(nums);
        System.out.println(b);
    }
}
