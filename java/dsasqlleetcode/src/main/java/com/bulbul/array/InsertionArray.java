package com.bulbul.array;

public class InsertionArray {

    public static void main(String[] args) {
        InsertionArray insertionArray = new InsertionArray();
        int[] arr = {1, 14, 18, 24, 38, 40 ,43 ,14 ,40 ,1, 54};
        insertionArray.sort(arr);
        insertionArray.print(arr);

    }

    private void print(int[] arr) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    private void sort(int[] arr) {
        for(int i=1;i<arr.length;i++){

            int current = arr[i];
            int j=i-1;
            while(j>=0 && current <  arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= current;
        }
    }
}
