package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PairsOfSimilarStringsTest {

    @Test
    void example1() {
        String[] words = {"aba", "aabb", "abcd", "bac", "aabc"};

        assertThat(PairsOfSimilarStrings.similarPairs(words)).isEqualTo(2);
    }

    @Test
    void example2() {
        String[] words = {"aabb", "ab", "ba"};

        assertThat(PairsOfSimilarStrings.similarPairs(words)).isEqualTo(3);
    }

    @Test
    void example3() {
        String[] words = {"nba", "cba", "dba"};

        assertThat(PairsOfSimilarStrings.similarPairs(words)).isZero();
    }
}
