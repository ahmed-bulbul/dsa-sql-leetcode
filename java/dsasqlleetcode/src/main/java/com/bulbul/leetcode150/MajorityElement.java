package com.bulbul.leetcode150;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int elm = majorityElement(nums);
        System.out.println(elm);
    }

    private static int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        int max=0;
        int majorityElement =0;
        for(Map.Entry<Integer,Integer> m : map.entrySet()){

            if(m.getValue() > max){
                max = m.getValue();
                majorityElement =m.getKey();
            }
        }
        System.out.println(max);
        return majorityElement ;

    }
}
