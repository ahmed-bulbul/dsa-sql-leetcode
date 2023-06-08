package com.bulbul.array;

public class LeftRotation {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d=4;
        leftRotationOptimized(arr,d);
    }

    private static void leftRotation(int[] arr,int d) {
        for(int i=0;i<d;i++){
            int temp = arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
    }

    private static void leftRotationOptimized(int[] arr,int d) {
        int[] newArray = new int[arr.length];
        int count = 0;
        for(int i=d;i<arr.length;i++){
            newArray[count]=arr[i];
            count++;
        }

        for(int i=0;i<d;i++){
            newArray[count]= arr[i];
            count++;
        }

        print(newArray);
    }
    private static void print(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
