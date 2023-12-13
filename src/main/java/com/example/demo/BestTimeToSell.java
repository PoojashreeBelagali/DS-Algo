package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class BestTimeToSell {
    public static void main(String[] args) {
        int[] d = {7,1,5,3,6,4};
        System.out.println(maxProfit(d));
    }

    public static int maxProfit(int[] prices) {

        int left=0, right=1, maxProfit=0;

        while(right < prices.length){
            //We want a profitable deal. Hence if the cost at day we buy the stock is less than the price on
            //the day we sell the stock, calculating currentProfit.
            //If currentProfit is greater that maxProfit, updating maxProfit
            if(prices[left]<prices[right]){
                int currentProfit = prices[right]-prices[left];
                maxProfit = Math.max(maxProfit, currentProfit);
            }else{
                //if we found a day having even less price , we will buy the stock at that day.
                left = right;
            }
            right++;
        }

        return maxProfit;
    }
}
