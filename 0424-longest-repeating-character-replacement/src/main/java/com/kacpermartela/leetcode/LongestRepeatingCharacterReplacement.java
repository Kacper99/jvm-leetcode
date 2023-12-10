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
            int mostFrequent = mostFrequent(charCount);

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

    private static int mostFrequent(Map<Character, Integer> map) {
        int mostFrequent = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            mostFrequent = Math.max(mostFrequent, entry.getValue());
        }
        return mostFrequent;
    }
}
