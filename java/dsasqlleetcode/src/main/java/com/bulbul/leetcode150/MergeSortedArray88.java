package com.bulbul.leetcode150;

import java.util.Arrays;

public class MergeSortedArray88 {

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2 = {2,5,6};
        int n=3;

//        mergeSortedArray(nums1,m,nums2,n);
        mergeSortedArray2(nums1,m,nums2,n);
        printArray(nums1);
    }

    private static void printArray(int[] nums1) {
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
    }

    private static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while (j>=0){
            if(i>=0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            }else{
                nums1[k--] = nums2[j--];
            }
        }
    }

    private static void mergeSortedArray2(int[] nums1, int m, int[] nums2, int n) {

        for(int i=0;i<n;i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
