package com.bulbul.leetcode150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordPattern {

//    Input: pattern = "abba", s = "dog cat cat dog"
//    Output: true

    public static void main(String[] args) {

        String pattern = "abba", s = "dog cat cat dog";
        String[] splittedString =s.split("");

        System.out.println(wordPattern(pattern,s));

    }

    public static boolean wordPattern(String pattern, String s) {

        Pattern patternStr = Pattern.compile(" ");
        Matcher matcher = patternStr.matcher(s);
        int spaceCount = 0;
        while (matcher.find()) {
            spaceCount++;
        }

        Map<Character,String> map = new HashMap<>();
        String[] arr = new String[spaceCount+1];
        int arrCount = 0;
        StringBuilder tempWord = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                tempWord.append(s.charAt(i));
            }else{
                arr[arrCount]= tempWord.toString();
                tempWord = new StringBuilder();
                arrCount++;
            }
        }
        arr[arrCount]= tempWord.toString();

        for(int i=0,j=0;i<pattern.length();i++){
            if(!map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i),arr[j]);
            }else{
               String val =  map.get(pattern.charAt(i));
               if(!val.equals(arr[j])){
                   return false;
               }
            }
            j++;
        }
        return true;

    }
}
