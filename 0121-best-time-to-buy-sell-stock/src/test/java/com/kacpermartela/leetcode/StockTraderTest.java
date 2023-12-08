package com.kacpermartela.leetcode;

import static com.kacpermartela.leetcode.StockTrader.maxProfit;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StockTraderTest {

    @Test
    void validBuySellScenario() {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit(prices);

        assertThat(result).isEqualTo(5);
    }

    @Test
    void onyOnePrice() {
        int[] prices = {7};

        int result = maxProfit(prices);

        assertThat(result).isZero();
    }

    @Test
    void isEmpty() {
        int[] prices = {};

        int result = maxProfit(prices);

        assertThat(result).isZero();
    }
}
