package misscelenious;

import java.util.Arrays;

public class RoatateArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,9,10};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void rotate(int[] arr, int k) {

        //k = k% arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);

    }

    public static void reverse(int[] nums, int start, int end){

        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}
