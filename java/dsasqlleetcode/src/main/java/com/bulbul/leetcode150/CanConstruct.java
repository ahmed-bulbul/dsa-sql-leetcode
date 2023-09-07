package com.bulbul.leetcode150;

public class CanConstruct {

    public static void main(String[] args) {

        String ransomNote="aa",magazine = "xaab";
        System.out.println(canConstruct(ransomNote,magazine));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] vals = new int[26]; // minus 97
        for(char c : magazine.toCharArray()) {
            vals[(int)c-97]++;
        }
        for(char c: ransomNote.toCharArray()) {
            if(--vals[(int)c-97]<0) {
                return false;
            }
        }
        return true;

    }
}
