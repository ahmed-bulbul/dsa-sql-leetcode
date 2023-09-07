package com.bulbul.leetcode;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] s = {'H','e','l','l','o'};
        reverseString(s);

    }

    public static void reverseString(char[] s) {
        int len = s.length;

        int left = 0,right =len-1;

        char temp;

        for(int i=left;i<right;i++){
            temp = s[i];
            s[i] = s[right];
            s[right] = temp;
            right--;

        }

        System.out.println(Arrays.toString(s));
    }
}
