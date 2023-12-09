package com.kacpermartela.leetcode;

import static com.kacpermartela.leetcode.LongestRepeatingCharacterReplacement.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestRepeatingCharacterReplacementTest {

    @Test
    void ABAB() {
        String s = "ABAB";
        int k = 2;

        int longest = characterReplacement(s, k);

        assertThat(longest).isEqualTo(4);
    }

    @Test
    void AABABBA() {
        String s = "AABABBA";
        int k = 1;

        int longest = characterReplacement(s, k);

        assertThat(longest).isEqualTo(4);
    }

    @Test
    void ABBB() {
        String s = "ABBB";
        int k = 2;

        int longest = characterReplacement(s, k);

        assertThat(longest).isEqualTo(4);
    }

    @Test
    void empty() {
        String s = "";
        int k = 1;

        int longest = characterReplacement(s, k);

        assertThat(longest).isEqualTo(0);
    }

    @Test
    void singleChar() {
        String s = "A";
        int k = 1;

        int longest = characterReplacement(s, k);

        assertThat(longest).isEqualTo(1);
    }

    @Test
    void kIs0() {
        String s = "AABA";
        int k = 0;

        int longest = characterReplacement(s, k);

        assertThat(longest).isEqualTo(2);

    }
}
