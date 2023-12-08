package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LongestSubstringTest {

    @Test
    void test() {
        String s = "abcabcbb";

        int result = LongestSubstring.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void allSameChars() {
        String s = "bbbb";

        int result = LongestSubstring.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void pwwkew() {
        String s = "pwwkew";

        int result = LongestSubstring.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void singleCharacter() {
        String s = " ";

        int result = LongestSubstring.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void dvdf() {
        String s = "dvdf";

        int result = LongestSubstring.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(3);
    }

    @Test
    void emptyString() {
        String s = "";

        int result = LongestSubstring.lengthOfLongestSubstring(s);

        assertThat(result).isEqualTo(0);
    }
}
