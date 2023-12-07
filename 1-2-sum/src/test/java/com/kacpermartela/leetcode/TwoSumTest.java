package com.kacpermartela.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = TwoSum.twoSum(nums, target);

        assertThat(result).containsExactlyInAnyOrder(0, 1);
    }
    @Test
    void twoSum2() {
        int[] nums = {-10,7,19,15};
        int target = 9;

        int[] result = TwoSum.twoSum(nums, target);

        assertThat(result).containsExactlyInAnyOrder(0, 2);
    }

}