package com.bulbul.leetcode150;


public class TrappingRainWater {

    public static void main(String[] args) {
        int[] height = {3,1,2,4,0,1,3,2};
        int res = trap(height);
        System.out.println(res);
    }

    private static int trap(int[] height) {
        int[] left = new int[height.length];
        int[] right = new int[height.length];
        left[0]=height[0];
        right[right.length-1]=height[height.length-1];

        int leftMax = height[0];
        for(int i=1;i<height.length;i++){
            if(height[i]>leftMax){
                leftMax = height[i];
            }
            left[i] = leftMax;
        }

        int rightMax = height[height.length-1];
        for(int j = height.length-2;j>=0;j--){
            if(height[j] > rightMax){
                rightMax = height[j];
            }
            right[j] = rightMax;
        }

        int sum=0;

        for(int i=0;i<height.length-1;i++){
            sum = sum + Math.min(left[i],right[i])-height[i];
        }

        return sum;
    }
}
