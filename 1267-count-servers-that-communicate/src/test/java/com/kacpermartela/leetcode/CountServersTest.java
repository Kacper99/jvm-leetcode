package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountServersTest {

    @Test
    void countServers() {
        int[][] grid = {
            {1, 0},
            {0, 1}
        };
        assertThat(CountServers.countServers(grid)).isZero();
    }

    @Test
    void countServers2() {
        int[][] grid = {
            {1, 0},
            {1, 1}
        };
        assertThat(CountServers.countServers(grid)).isEqualTo(3);
    }

    @Test
    void countServers3() {
        int[][] grid = {
            {1, 1, 0, 0},
            {0, 0, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 0, 1}
        };
        assertThat(CountServers.countServers(grid)).isEqualTo(4);
    }
}
