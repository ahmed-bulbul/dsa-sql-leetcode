package com.bulbul.threads;

import java.util.concurrent.TimeUnit;

public class FirstTechnique {

    public static void main(String[] args) {
        System.out.println("Main Thread starts here......");
        new FirstTask();
        Thread t = new FirstTask();
        System.out.println("Main Thread ends here....");
    }
}


class FirstTask extends Thread{

    private static int count = 0;
    private int id;
    @Override
    public void run(){
        for(int i=10;i>0;i--){
            System.out.println("<"+id+"> TICK TICK - "+ i);

            try {
                TimeUnit.MICROSECONDS.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public FirstTask(){
        this.id = ++count;
        this.start();
    }
}