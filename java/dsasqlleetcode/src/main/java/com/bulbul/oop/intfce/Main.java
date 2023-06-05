package com.bulbul.oop.intfce;

public class Main {

    public static void main(String[] args) {
        Demo obj = new Demo();
        if(obj instanceof Print){
            obj.show();
        }else{
            System.out.println("Not permission.........");
        }
    }
}
