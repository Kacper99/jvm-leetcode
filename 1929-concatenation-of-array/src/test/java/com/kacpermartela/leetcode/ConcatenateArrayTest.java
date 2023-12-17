package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcatenateArrayTest {

    @Test
    void smallArray() {
        int[] nums = {1, 2, 1};

        int[] answer = ConcatenateArray.getConcatenation(nums);

        assertThat(answer).containsExactly(1, 2, 1, 1, 2, 1);
    }
}
