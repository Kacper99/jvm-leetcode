package com.kacpermartela.leetcode;

import java.util.stream.Collectors;

public class PairsOfSimilarStrings {

    public static int similarPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                final var charArray = words[i].chars().mapToObj(ch -> (char) ch).collect(Collectors.toSet());
                final var charArray1 =
                        words[j].chars().mapToObj(ch -> (char) ch).collect(Collectors.toSet());
                if (charArray.equals(charArray1)) {
                    count++;
                }
            }
        }
        return count;
    }
}
