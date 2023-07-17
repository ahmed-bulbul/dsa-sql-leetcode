package com.bulbul.leetcode150;

public class IsSubSequence {

    public static void main(String[] args) {
        String s = "b", t = "xahbgdc";
        System.out.println(isSubsequence(s,t));


    }

    public static boolean isSubsequence(String s, String t) {

        if(s.length()==0)
            return true;
        if(t.length()==0)
            return false;

        int j=0;
        for(int i=0;i<t.length() && j<s.length();i++){
            if(s.charAt(j) == t.charAt(i)){
                j++;
            }
        }

        return j == s.length();
    }
}
