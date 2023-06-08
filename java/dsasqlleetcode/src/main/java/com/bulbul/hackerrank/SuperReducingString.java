package com.bulbul.hackerrank;

public class SuperReducingString {

    public static void main(String[] args) {
        String s = "aaabccddd";

        System.out.println(superReducedString(s));
    }

    private static String superReducedString(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean passNeed = true;
        while (passNeed){
            passNeed = false;
            for(int i=0;i<sb.length()-1;i++){
                if(sb.charAt(i)==sb.charAt(i+1)){
                    sb.delete(i,i+1);
                    passNeed=true;
                }
            }
        }

        if(sb.length()==0){
            return "Empty String";
        }else{
            return sb.toString();
        }
    }
}
