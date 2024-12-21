package com.kacpermartela.leetcode;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortCharactersByFrequency {

    public static String frequencySort(String s) {
        final var characterCounts = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return characterCounts.entrySet().stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
                .map((entry) -> entry.getKey().toString().repeat(Math.toIntExact(entry.getValue())))
                .collect(Collectors.joining());
    }
}
