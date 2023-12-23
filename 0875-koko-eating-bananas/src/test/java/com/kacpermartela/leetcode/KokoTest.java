package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class KokoTest {

    @Test
    void example1() {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        assertThat(Koko.minEatingSpeed(piles, h)).isEqualTo(4);
    }

    @Test
    void example2() {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 5;

        assertThat(Koko.minEatingSpeed(piles, h)).isEqualTo(30);
    }

    @Test
    void example3() {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 6;

        assertThat(Koko.minEatingSpeed(piles, h)).isEqualTo(23);
    }

    @Test
    @Disabled("Length is always at least 1")
    void emptyPile() {
        int[] piles = {};
        int h = 6;

        assertThat(Koko.minEatingSpeed(piles, h)).isEqualTo(0);
    }

    @Test
    void failingExample1() {
        int[] piles = {805306368, 805306368, 805306368};
        int h = 1000000000;

        assertThat(Koko.minEatingSpeed(piles, h)).isEqualTo(3);
    }
}
