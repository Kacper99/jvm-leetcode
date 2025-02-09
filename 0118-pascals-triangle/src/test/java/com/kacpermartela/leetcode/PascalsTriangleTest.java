package com.kacpermartela.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PascalsTriangleTest {

    @Test
    void example1() {
        int numRows = 5;
        List<List<Integer>> expected =
                List.of(List.of(1), List.of(1, 1), List.of(1, 2, 1), List.of(1, 3, 3, 1), List.of(1, 4, 6, 4, 1));
        Assertions.assertThat(PascalsTriangle.generate(numRows)).isEqualTo(expected);
    }

    @Test
    void example2() {
        int numRows = 1;
        List<List<Integer>> expected = List.of(List.of(1));
        Assertions.assertThat(PascalsTriangle.generate(numRows)).isEqualTo(expected);
    }
}
