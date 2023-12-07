package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WaterContainersTest {

    @Test
    void biggestWaterContainer() {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int maxArea = WaterContainers.maxArea(heights);

        assertThat(maxArea).isEqualTo(49);
    }
}
