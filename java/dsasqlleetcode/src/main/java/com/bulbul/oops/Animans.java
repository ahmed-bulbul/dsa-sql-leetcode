package com.bulbul.oops;

public class Animans {

    public int sum(int a,int b) {
        return a+b;
    }

}

class Dog extends Animans{
    @Override
    public int sum(int a, int b) {
        return super.sum(a, b);
    }
}
