package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BaseballGameTest {

    @Test
    void game() {
        String[] ops = {"5", "2", "C", "D", "+"};

        int score = BaseballGame.calPoints(ops);

        assertThat(score).isEqualTo(30);
    }
}
