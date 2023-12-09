package com.kacpermartela.leetcode;

public class LongestRepeatingCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        if (s.isEmpty()) {
            return 0;
        }

        int leftPointer = 0;
        int rightPointer = 1;

        int runningK = k;
        char previousChar = s.charAt(leftPointer);

        int maxLength = 1;

        while (rightPointer < s.length()) {
            char rightPointerChar = s.charAt(rightPointer);
            if (rightPointerChar == previousChar) {
                rightPointer++;
            } else if (rightPointer == leftPointer + 1 && runningK > 0) {
                previousChar = rightPointerChar;
                runningK--;
                rightPointer++;
            } else if (runningK > 0) {
                rightPointer++;
                runningK--;
            } else if (runningK == 0) {
                leftPointer++;
                previousChar = s.charAt(leftPointer);
                rightPointer = leftPointer + 1;
                runningK = k;
            }
            maxLength = Math.max(maxLength, rightPointer - leftPointer);
        }
        return maxLength;
    }
}
