package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class UniquePaths2Test {

    @Test
    void example1() {
        int[][] grid = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        assertThat(UniquePaths2.uniquePathsWithObstacles(grid)).isEqualTo(2);
    }

    @Test
    void example2() {
        int[][] grid = {
            {0, 1},
            {0, 0}
        };
        assertThat(UniquePaths2.uniquePathsWithObstacles(grid)).isOne();
    }

    @Test
    void example3() {
        int[][] grid = {
            {0, 0},
            {1, 1},
            {0, 0}
        };
        assertThat(UniquePaths2.uniquePathsWithObstacles(grid)).isZero();
    }
}
