package com.kacpermartela.leetcode;

import org.junit.jupiter.api.Test;

import static com.kacpermartela.leetcode.StockTrader.maxProfit;
import static org.assertj.core.api.Assertions.assertThat;

class StockTraderTest {

    @Test
    void validBuySellScenario() {
        int[] prices = {
            7, 1, 5, 3, 6, 4
        };

        int result = maxProfit(prices);

        assertThat(result).isEqualTo(5);
    }
}