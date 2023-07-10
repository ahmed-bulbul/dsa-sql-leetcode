package com.bulbul.leetcode150;

public class RemoveElement27 {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val =3;
        int count = removeElement(nums,val);
        System.out.println("count : "+count);
    }

    private static int removeElement(int[] nums,int val) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] !=val){
                nums[count] = nums[i];
                count++;
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

        System.out.println();
        return count;
    }
}
