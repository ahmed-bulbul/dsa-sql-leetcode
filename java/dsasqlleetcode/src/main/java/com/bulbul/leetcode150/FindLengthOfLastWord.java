package com.bulbul.leetcode150;

public class FindLengthOfLastWord {

    public static void main(String[] args) {
        String s ="May day";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
//        StringBuilder sb = new StringBuilder();
//        String trsimString = s.trim();
//
//        int flag = 0;
//        for(int i=trsimString.length()-1;i>=0;i--){
//            if(trsimString.charAt(i)!= ' '){
//                flag++;
//                sb.append(trsimString.charAt(i));
//            }else{
//                break;
//            }
//        }
//        if(flag==0){
//            return trsimString.length();
//        }else{
//            return sb.length();
//        }

        String[] str = s.split(" ");
        System.out.println(str.length-1);
        return str[str.length-1].length();


    }
}
