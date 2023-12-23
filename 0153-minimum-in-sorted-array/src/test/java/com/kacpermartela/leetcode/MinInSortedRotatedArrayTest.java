package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinInSortedRotatedArrayTest {

    @Test
    void example1() {
        int[] nums = {3, 4, 5, 1, 2};
        assertThat(MinInSortedRotatedArray.findMin(nums)).isEqualTo(1);
    }

    @Test
    void example2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        assertThat(MinInSortedRotatedArray.findMin(nums)).isEqualTo(0);
    }

    @Test
    void example2point5() {
        int[] nums = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 0, 1, 2};
        assertThat(MinInSortedRotatedArray.findMin(nums)).isEqualTo(0);
    }

    @Test
    void example3() {
        int[] nums = {11, 13, 15, 17};
        assertThat(MinInSortedRotatedArray.findMin(nums)).isEqualTo(11);
    }

    @Test
    void singleElement() {
        int[] nums = {1};
        assertThat(MinInSortedRotatedArray.findMin(nums)).isEqualTo(1);
    }

    @Test
    void twoElements() {
        int[] nums = {2, 1};
        assertThat(MinInSortedRotatedArray.findMin(nums)).isEqualTo(1);
    }

    @Test
    void noRotation() {
        int[] nums = {1, 2, 3, 4, 5};
        assertThat(MinInSortedRotatedArray.findMin(nums)).isEqualTo(1);
    }

    @Test
    void middleIsLowest() {
        int[] nums = {5, 6, 7, 1, 2, 3, 4};
        assertThat(MinInSortedRotatedArray.findMin(nums)).isEqualTo(1);
    }

    @Test
    void failing1() {
        int[] nums = {5, 1, 2, 3, 4};
        assertThat(MinInSortedRotatedArray.findMin(nums)).isEqualTo(1);
    }
}
