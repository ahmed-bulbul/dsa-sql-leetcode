package com.bulbul.leetcode150;

public class HappyNumber {

    public static void main(String[] args) {
        int n=11;
        System.out.println(isHappy(n));

    }

    public static boolean isHappy(int n) {


        int temp = n;
        if(temp <=9){
            return false;
        }
        if(temp==1)
            return true;

        while(temp>=0){
            temp = findSqrt(n);

            System.out.println(temp);
        }
        isHappy(temp);
        return false;

    }

    public static int findSqrt(int n){
        int ans = 0;
        while (n>0){
            int rem = n%10;
            ans  = ans + rem * rem;
            n=n/10;
        }
        return ans;
    }
}
