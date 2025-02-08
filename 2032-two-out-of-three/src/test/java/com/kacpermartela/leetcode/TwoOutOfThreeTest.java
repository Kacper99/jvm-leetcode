package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TwoOutOfThreeTest {

    @Test
    void example1() {
        int[] nums1 = {1, 1, 3, 2};
        int[] nums2 = {2, 3};
        int[] nums3 = {3};
        assertThat(TwoOutOfThree.twoOutOfThree(nums1, nums2, nums3)).containsExactlyInAnyOrder(3, 2);
    }

    @Test
    void example2() {
        int[] nums1 = {3, 1};
        int[] nums2 = {2, 3};
        int[] nums3 = {1, 2};
        assertThat(TwoOutOfThree.twoOutOfThree(nums1, nums2, nums3)).containsExactlyInAnyOrder(1, 2, 3);
    }
}
