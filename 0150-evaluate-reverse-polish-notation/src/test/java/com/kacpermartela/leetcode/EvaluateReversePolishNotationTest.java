package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class EvaluateReversePolishNotationTest {

    @Test
    void test1() {
        String[] tokens = {"2", "1", "+", "3", "*"};
        assertThat(EvaluateReversePolishNotation.evalRPN(tokens)).isEqualTo(9);
    }

    @Test
    void test2() {
        String[] tokens = {"4", "13", "5", "/", "+"};
        assertThat(EvaluateReversePolishNotation.evalRPN(tokens)).isEqualTo(6);
    }

    @Test
    void test3() {
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        assertThat(EvaluateReversePolishNotation.evalRPN(tokens)).isEqualTo(22);
    }
}
