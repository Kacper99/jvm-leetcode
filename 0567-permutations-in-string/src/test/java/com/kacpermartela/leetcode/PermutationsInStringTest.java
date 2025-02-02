package com.kacpermartela.leetcode;

import static com.kacpermartela.leetcode.PermutationsInString.*;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PermutationsInStringTest {

    @Test
    void example1() {
        assertThat(checkInclusion("ab", "eidbaooo")).isTrue();
    }
}
