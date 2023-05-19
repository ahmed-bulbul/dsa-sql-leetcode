package com.bulbul;

public class Strings {

    public static void main(String[] args) {
        //String concat
        String str = "Hello" + " -  World";
        System.out.println(str);
        String firstName = "BUlbul";
        String lastName = "Ahmed";
        String fullName = firstName+" "+lastName;
        System.out.println(lastName);

        // CharAt [ String to array]
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        //String reverse
        String rev = "";
        for(int i=fullName.length()-1;i>=0;i--){
            rev+=fullName.charAt(i);
        }
        System.out.println(rev);

    }
}
