package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class HouseRobberTest {

    @ParameterizedTest
    @MethodSource("input")
    void robSimple(int[] input, int expected) {
        assertThat(HouseRobber.rob(input)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("complex")
    void robComplex(int[] input, int expected) {
        assertThat(HouseRobber.rob(input)).isEqualTo(expected);
    }

    private static Stream<Arguments> input() {
        return Stream.of(Arguments.of(new int[] {1, 2, 3, 1}, 4), Arguments.of(new int[] {2, 7, 9, 3, 1}, 12));
    }

    private static Stream<Arguments> complex() {
        return Stream.of(Arguments.of(
                new int[] {
                    114, 117, 207, 117, 235, 82, 90, 67, 143, 146, 53, 108, 200, 91, 80, 223, 58, 170, 110, 236, 81, 90,
                    222, 160, 165, 195, 187, 199, 114, 235, 197, 187, 69, 129, 64, 214, 228, 78, 188, 67, 205, 94, 205,
                    169, 241, 202, 144, 240
                },
                4173));
    }
}
