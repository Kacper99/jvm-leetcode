package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValidParenthesesTest {

    @ParameterizedTest
    @ValueSource(strings = {"()", "()[]{}", ""})
    void valid(String s) {
        boolean valid = ValidParentheses.isValid(s);

        assertThat(valid).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"{]", "}", "){", "(("})
    void invalid(String s) {
        boolean valid = ValidParentheses.isValid(s);

        assertThat(valid).isFalse();
    }
}
