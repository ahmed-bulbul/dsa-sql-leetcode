package com.bulbul.sort;


//Divide and Conquer Algorithm
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5, 9, 4, 6, 5, 3};
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }

    private static void quickSort(int[] arr, int begin, int end) {

        if (begin < end) {
            int partitionIndex = partition(arr, begin, end); //return pivot correct position

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    }

    private static int partition(int[] arr, int begin, int end) {

        int pivot = arr[end];
        int i = begin-1;

        for(int j=begin;j<end;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end]=temp;

        return i+1;
    }

    private static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
