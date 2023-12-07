package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoSumTest {

    @Test
    void twoSum() {
        final int[] input = {2, 7, 11, 15};
        final int target = 9;

        final int[] result = TwoSum.twoSum(input, target);

        assertThat(result).containsOnly(1, 2);
    }
}
