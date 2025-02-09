package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GenerateParenthesesTest {

    @Test
    void example1() {
        var result = GenerateParentheses.generateParenthesis(3);
        assertThat(result).containsExactlyInAnyOrder("((()))", "(()())", "(())()", "()(())", "()()()");
    }
}
