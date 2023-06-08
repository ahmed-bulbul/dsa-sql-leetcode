package com.bulbul.array.technique.twopointer;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {-3,2,3,3,6,8,15};
        int target = 14;
        int[] res = twoSum(arr,target);

        printArr(res);
    }

    private static void printArr(int[] res) {
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+", ");
        }
    }

    private static int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        int[] result = new int[2];

        while (start<end){
            int sum = arr[start] +arr[end];

            if(sum==target){
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            }

            if(sum > target){
                end--;
            }else {
                start++;
            }
        }

        return result;
    }

}
