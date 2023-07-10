package com.bulbul.hackerrank;

public class Prime {

    public static void main(String[] args) {
        String A ="madam";

        for(int i=0;i<A.length()/2;i++){

            if(A.charAt(i) != A.charAt(A.length()-1-i)){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}
