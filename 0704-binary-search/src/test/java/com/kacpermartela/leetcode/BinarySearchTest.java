package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void search() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        int actual = BinarySearch.search(nums, target);

        assertThat(actual).isEqualTo(2);
    }

    @Test
    void searchNotFound() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 6;
        int actual = BinarySearch.search(nums, target);

        assertThat(actual).isEqualTo(-1);
    }

    @Test
    void example1() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int actual = BinarySearch.search(nums, target);

        assertThat(actual).isEqualTo(4);
    }

    @Test
    void example2() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int actual = BinarySearch.search(nums, target);

        assertThat(actual).isEqualTo(-1);
    }

    @Test
    void example3() {
        int[] nums = {5};
        int target = 5;
        int actual = BinarySearch.search(nums, target);

        assertThat(actual).isEqualTo(0);
    }

    @Test
    void example4() {
        int[] nums = {5, 7};
        int target = 7;
        int actual = BinarySearch.search(nums, target);

        assertThat(actual).isEqualTo(1);
    }
}
