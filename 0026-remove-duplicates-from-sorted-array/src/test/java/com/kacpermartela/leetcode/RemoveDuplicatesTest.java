package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

    @Test
    void empty() {
        int[] nums = {};

        int length = RemoveDuplicates.removeDuplicates(nums);

        assertThat(length).isZero();
        assertThat(nums).isEmpty();
    }

    @Test
    void removeDuplicates() {
        int[] nums = {1, 1, 2};

        int actualLength = RemoveDuplicates.removeDuplicates(nums);

        assertThat(actualLength).isEqualTo(2);
        assertThat(nums).containsOnly(1, 2);
    }

    @Test
    void removeDuplicates2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int actualLength = RemoveDuplicates.removeDuplicates(nums);

        assertThat(actualLength).isEqualTo(5);
        assertThat(nums).containsOnly(0, 1, 2, 3, 4);
    }
}
