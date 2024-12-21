package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.*;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SortCharactersByFrequencyTest {

    @ParameterizedTest
    @MethodSource("examples")
    void examplesTest(String input, String expectedOutput) {
        assertThat(SortCharactersByFrequency.frequencySort(input)).isEqualTo(expectedOutput);
    }

    private static Stream<Arguments> examples() {
        return Stream.of(Arguments.of("tree", "eert"), Arguments.of("cccaaa", "aaaccc"), Arguments.of("Aabb", "bbaA"));
    }
}
