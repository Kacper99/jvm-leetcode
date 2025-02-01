package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpecialArrayTest {

    @Test
    void isArraySpecial() {
        int[] nums = {1};
        assertThat(new SpecialArray().isArraySpecial(nums)).isTrue();
    }

    @Test
    void isArraySpecial2() {
        int[] nums = {2, 1, 4};
        assertThat(new SpecialArray().isArraySpecial(nums)).isTrue();
    }

    @Test
    void isArraySpecial3() {
        int[] nums = {4, 3, 1, 6};
        assertThat(new SpecialArray().isArraySpecial(nums)).isFalse();
    }

    @Test
    void isArraySpecial4() {
        int[] nums = {1, 5};
        assertThat(new SpecialArray().isArraySpecial(nums)).isFalse();
    }
}
