package com.bulbul.leetcode150;

public class FirstOccurrence  {

    public static void main(String[] args) {

        String haystack = "adbutsad", needle = "sad";

        System.out.println(strStr(haystack,needle));


    }

    public static int strStr(String haystack, String needle) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
//            for (int j = i; j < i + needle.length(); j++) {
//                sb.append(haystack.charAt(j));
//            }
//            if (sb.toString().equals(needle)) {
//                return i;
//            }
//            sb.delete(0, sb.length());
//        }
//        return -1;
        return haystack.indexOf(needle);
    }

}
