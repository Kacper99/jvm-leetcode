package com.kacpermartela.leetcode;

public class StockTrader {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int leftPointer = 0;
        int rightPointer = 1;

        while (rightPointer < prices.length) {
            int profit = prices[rightPointer] - prices[leftPointer];
            maxProfit = Math.max(profit, maxProfit);
            if (prices[rightPointer] < prices[leftPointer]) {
                leftPointer = rightPointer;
            }
            rightPointer++;
        }

        return maxProfit;
    }
}
