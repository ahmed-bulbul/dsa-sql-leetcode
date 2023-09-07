package com.bulbul.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MargeTwoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {2,5,8,9,15};
        int n1=5;
        int[] arr2 = {3,6,10,11,12};
        int n2=5;
        int[] arr3 = new int[n1+n2];
        mergeArray(arr1,arr2,n1,n2,arr3);

        System.out.println(Arrays.toString(arr3));
    }

    public static void mergeArray(int[] arr1, int[] arr2,int n1,int n2, int[] arr3){

        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(arr1[i] > arr2[j]){
                arr3[k] = arr2[j];
                k++;
                j++;
            }else if(arr1[i] < arr2[i] ){
                arr3[k] = arr1[i];
                k++;
                i++;
            }
        }

        while(i<n1){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            arr3[k] = arr2[j];
            j++;
            k++;
        }


    }

}


