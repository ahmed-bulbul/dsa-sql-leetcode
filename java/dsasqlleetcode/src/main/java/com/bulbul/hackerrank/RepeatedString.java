package com.bulbul.hackerrank;

public class RepeatedString {

    public static void main(String[] args) {
        String s = "a";
        int n=10;

        repeat(s,n);
    }

    private static void repeat(String s, int n) {

        StringBuilder sb = new StringBuilder();
        int len = n-s.length();
        for(int i=0;i<len;i++){
            sb.append(s.charAt(i% s.length()));
        }
        String concatedStr  = s+sb;
        int count =0;
        for(int i=0;i<concatedStr.length();i++){
            if(concatedStr.charAt(i)=='a')
                count++;
        }
        System.out.println(count);
    }
}
