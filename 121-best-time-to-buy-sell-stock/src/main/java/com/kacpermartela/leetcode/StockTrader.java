package com.kacpermartela.leetcode;

public class StockTrader {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = -prices[i] + prices[j];
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}
