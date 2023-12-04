package com.kacpermartela.leetcode;

import static com.kacpermartela.leetcode.Palindrome.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PalindromeTest {

    @ParameterizedTest
    @ValueSource(strings = {"A man, a plan, a canal: Panama", " "})
    void validPalindromes(String s) {
        assertThat(isPalindrome(s)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"race a car"})
    void invalidPalindromes(String s) {
        assertThat(isPalindrome(s)).isFalse();
    }
}
