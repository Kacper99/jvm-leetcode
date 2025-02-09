package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class UniquePathsTest {

    @Test
    void example1() {
        assertThat(UniquePaths.uniquePaths(3, 2)).isEqualTo(3);
    }

    @Test
    void example2() {
        assertThat(UniquePaths.uniquePaths(7, 3)).isEqualTo(28);
    }

    @Test
    void example3() {
        assertThat(UniquePaths.uniquePaths(51, 9)).isEqualTo(1916797311);
    }
}
