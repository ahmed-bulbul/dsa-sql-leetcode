package com.bulbul.leetcode150;

public class BestTimeByBook121 {
    public  static int maxProfit(int[] prices) {

        int max =0 , min = prices[0];
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(min > prices[i]){
                min = prices[i];
            }
            max = prices[i]-min;
            if(maxProfit<max)
            {
                maxProfit = max;
            }
        }


        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}
