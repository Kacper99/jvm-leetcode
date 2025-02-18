package com.kacpermartela.leetcode;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 * removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric
 * characters include letters and numbers.
 */
public class Palindrome {

    static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        if (s.length() < 2) {
            return true;
        }

        for (int leftPointerIndex = 0; leftPointerIndex < s.length() / 2; leftPointerIndex++) {
            int rightPointerIndex = s.length() - leftPointerIndex - 1;

            if (leftPointerIndex == rightPointerIndex || leftPointerIndex == rightPointerIndex + 1) {
                return true;
            }

            char leftPointer = s.charAt(leftPointerIndex);
            char rightPointer = s.charAt(rightPointerIndex);
            if (leftPointer != rightPointer) {
                return false;
            }
        }

        return true;
    }
}
