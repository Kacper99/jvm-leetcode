package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UniquePathsDPTest {

    @Test
    void example1() {
        assertThat(UniquePathsDP.uniquePaths(3, 2)).isEqualTo(3);
    }

    @Test
    void example2() {
        assertThat(UniquePathsDP.uniquePaths(7, 3)).isEqualTo(28);
    }

    @Test
    void example3() {
        assertThat(UniquePathsDP.uniquePaths(51, 9)).isEqualTo(1916797311);
    }
}
