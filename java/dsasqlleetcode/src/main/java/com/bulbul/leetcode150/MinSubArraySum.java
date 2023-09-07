package com.bulbul.leetcode150;

public class MinSubArraySum {

    public static void main(String[] args) {

    }


    public static int minSubArrayLen(int target, int[] nums) {

        int n=nums.length, window=0,ans=n+1,left=0;
        // 1,2,3
        for(int right = 0; right < n; right++){
            window = window + nums[right];
            while(window >= target){
                ans = Math.min(ans, right-left +1);
                window = window-nums[left];
                left++;
            }
        }

        return ans == n+1 ? 0 : ans;
    }
}
