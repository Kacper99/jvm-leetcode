package com.kacpermartela.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int leftPointer = 0;
        int rightPointer = 1;

        Set<Character> seenChars = new HashSet<>();
        int maxLength = 1;

        seenChars.add(s.charAt(leftPointer));
        while (rightPointer < s.length()) {
            boolean added = seenChars.add(s.charAt(rightPointer));
            if (added) {
                rightPointer++;
                maxLength = Math.max(maxLength, rightPointer - leftPointer);
            } else {
                seenChars.remove(s.charAt(leftPointer));
                leftPointer++;
            }
        }

        return maxLength;
    }
}
