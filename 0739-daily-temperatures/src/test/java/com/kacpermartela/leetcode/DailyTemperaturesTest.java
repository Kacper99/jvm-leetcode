package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DailyTemperaturesTest {

    @Test
    void example1() {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] expected = {1, 1, 4, 2, 1, 1, 0, 0};
        assertThat(DailyTemperatures.dailyTemperatures(temperatures)).isEqualTo(expected);
    }
}
