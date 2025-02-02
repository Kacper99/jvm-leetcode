package com.kacpermartela.leetcode;

import static com.kacpermartela.leetcode.HowManyNumbersAreSmallerThanCurrent.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HowManyNumbersAreSmallerThanCurrentTest {

    @Test
    void test() {
        assertThat(smallerNumbersThanCurrent(new int[] {8, 1, 2, 2, 3})).containsExactly(4, 0, 1, 1, 3);
    }

    @Test
    void test2() {
        assertThat(smallerNumbersThanCurrent(new int[] {6, 5, 4, 8})).containsExactly(2, 1, 0, 3);
    }

    @Test
    void test3() {
        assertThat(smallerNumbersThanCurrent(new int[] {7, 7, 7, 7})).containsExactly(0, 0, 0, 0);
    }
}
