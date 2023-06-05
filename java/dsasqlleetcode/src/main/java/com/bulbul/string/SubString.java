package com.bulbul.string;

public class SubString {

    public static void main(String[] args) {

        String str = "bulbul";
        printSubStr(str);
    }

    private static void printSubStr(String str) {
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                System.out.println(" "+str.substring(i,j+1));
            }
        }
    }
}
