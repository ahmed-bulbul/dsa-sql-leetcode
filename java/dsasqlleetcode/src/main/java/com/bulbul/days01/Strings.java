package com.bulbul.days01;

public class Strings {

    public static void main(String[] args) {
        //String concat
        String str = "Hello" + "   World";
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
        boolean t = isPalindrome("madame");
        System.out.println(t);

    }

    public static boolean isPalindrome(String str){
        int mid = str.length()/2;
        int i,j;
        for( i=0, j=str.length()-1;i<mid ;j--,i++){
            if(str.charAt(i)!= str.charAt(j))
                return false;
        }
        return true;

    }
}
