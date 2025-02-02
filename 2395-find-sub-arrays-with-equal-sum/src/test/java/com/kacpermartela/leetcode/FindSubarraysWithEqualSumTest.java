package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindSubarraysWithEqualSumTest {

    @Test
    public void example1() {
        assertThat(FindSubarraysWithEqualSum.findSubarrays(new int[] {1, 2, 3, 4}))
                .isFalse();
    }

    @Test
    public void example2() {
        assertThat(FindSubarraysWithEqualSum.findSubarrays(new int[] {4, 2, 4})).isTrue();
    }

    @Test
    public void example3() {
        assertThat(FindSubarraysWithEqualSum.findSubarrays(new int[] {0, 0, 0, 0}))
                .isTrue();
    }
}
