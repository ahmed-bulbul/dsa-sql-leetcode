package com.bulbul.hackerrank.javas;

import java.util.HashMap;


public class Anagrams {

    public static void main(String[] args) {
        String a = "anagramm";
        String b= "marganaa";

        System.out.println(isAnagram(a,b));
    }

    static boolean isAnagram2(String a , String b){

        if(a.length()!=b.length()){
            return false;
        }

        a= a.toLowerCase();
        b=b.toLowerCase();

        char[] chArr = a.toCharArray();
        char[] chArr1 = b.toCharArray();

        java.util.Arrays.sort(chArr);
        java.util.Arrays.sort(chArr1);

        return java.util.Arrays.equals(chArr, chArr1);
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        HashMap<Character,Integer> firstMap = new HashMap<>();
        HashMap<Character,Integer> secondMap = new HashMap<>();

        for(int j=0;j<a.length();j++){
            if(firstMap.containsKey(a.charAt(j))){
                firstMap.put(a.charAt(j),firstMap.get(a.charAt(j))+1);
            }else{
                firstMap.put(a.charAt(j),1);
            }
        }

        for(int j=0;j<b.length();j++){
            if(secondMap.containsKey(b.charAt(j))){
                secondMap.put(b.charAt(j),secondMap.get(b.charAt(j))+1);
            }else{
                secondMap.put(b.charAt(j),1);
            }
        }


        for(int i=0;i<a.length();i++){
            Character c = a.charAt(i);
            int val1 = firstMap.get(c);
            int val2 = secondMap.get(c);

            if(val1!=val2)
                return false;
        }

        return true;

    }

}
