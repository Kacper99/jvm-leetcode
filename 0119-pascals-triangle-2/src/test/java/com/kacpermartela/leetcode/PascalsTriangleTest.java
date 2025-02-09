package com.kacpermartela.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PascalsTriangleTest {

    @Test
    void example() {
        Assertions.assertThat(PascalsTriangle.getRow(3)).isEqualTo(List.of(1, 3, 3, 1));
    }
}
