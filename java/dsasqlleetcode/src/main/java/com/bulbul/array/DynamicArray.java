package com.bulbul.array;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {
    List<Integer> seq = new ArrayList<>();
    List<List<Integer>> seqList = new ArrayList<List<Integer>>();
    int lastAns = 0;

    public DynamicArray(int N){
        for(int i=0;i<N;i++){
            seq = new ArrayList<Integer>();
            seqList.add(seq);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int Q = scanner.nextInt();


    }
}
