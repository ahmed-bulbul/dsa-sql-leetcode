package com.bulbul.hackerrank.javas;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
//`        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//
//        // Write your code here.
//        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
//        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
//        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
//        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
//        String bang = NumberFormat.getCurrencyInstance(new Locale("bn", "BD")).format(payment);
//
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
//        System.out.println("Bangladesh : " + bang);`

        System.out.println(compareTo("jaaa","jaua"));

    }

    public static int compareTo(String s1, String s2){
        int len1 = s1.length();
        int len2 = s2.length();
        int min = Math.min(len1,len2);

        char[] ch1 =s1.toCharArray();
        char[] ch2 =s2.toCharArray();

        for(int i=0;i<min;i++){
            char c1 = ch1[i];
            char c2 = ch2[i];

            System.out.println("c1 = "+c1+" and c2 = "+c2+" ");

            if(c1!=c2)
                return c1-c2;
        }

        return len1-len2;
    }
}
