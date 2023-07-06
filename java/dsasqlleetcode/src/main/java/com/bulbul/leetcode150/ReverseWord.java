package com.bulbul.leetcode150;

import java.util.Arrays;

public class ReverseWord {

    public static void main(String[] args) {
        String s ="a good   example";
        s=s.trim();

        String[] word =s.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for(int i= word.length-1;i>=0;i--){
            if(!word[i].equals("")){
                stringBuilder.append(word[i]).append(" ");
            }
        }
        System.out.println(stringBuilder);

    }
}
