package com.kacpermartela.leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class PermutationsInString {

    public static boolean checkInclusion(String s1, String s2) {
        int[] s1CharCount = new int[26];

        HashSet<Character> charsInS1 = new HashSet<>();

        s1.chars().forEach(c -> {
            s1CharCount[c - 97]++;
            charsInS1.add((char) c);
        });

        for (int i = 0; i < s2.length(); i++) {
            if (charsInS1.contains(s2.charAt(i)) && (s2.length() - i >= s1.length())) {
                int[] s2CharCount = new int[26];
                for (int j = 0; j < s1.length(); j++) {
                    s2CharCount[s2.charAt(i + j) - 97]++;
                }
                if (Arrays.equals(s1CharCount, s2CharCount)) {
                    return true;
                }
            }
        }

        return false;
    }
}
