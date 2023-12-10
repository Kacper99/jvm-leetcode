package com.kacpermartela.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        if (s.isEmpty()) {
            return 0;
        }

        int leftPointer = 0;
        int rightPointer = 1;

        int maxLength = 1;

        Map<Character, Integer> charCount = new HashMap<>();
        charCount.put(s.charAt(leftPointer), 1);

        while (rightPointer < s.length()) {
            charCount.merge(s.charAt(rightPointer), 1, Integer::sum);
            int mostFrequent = charCount.values().stream()
                    .max(Integer::compareTo)
                    .orElseThrow(() -> new IllegalStateException("This shouldn't happen"));

            int stringLen = rightPointer - leftPointer + 1;
            if (stringLen - mostFrequent <= k) {
                maxLength = Math.max(maxLength, stringLen);
            } else {
                charCount.merge(s.charAt(leftPointer), -1, Integer::sum);
                leftPointer++;
            }
            rightPointer++;
        }

        return maxLength;
    }
}
