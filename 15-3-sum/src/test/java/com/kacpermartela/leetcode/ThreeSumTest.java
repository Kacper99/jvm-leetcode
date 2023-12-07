package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class ThreeSumTest {

    @Test
    void threeSum() {
        System.out.println("Got here");
        int[] input = {-1, 0, 1, 2, -1, -4};

        var results = ThreeSum.threeSum(input);

        assertThat(results).containsExactlyInAnyOrder(List.of(-1, -1, 2), List.of(-1, 0, 1));
    }
}
