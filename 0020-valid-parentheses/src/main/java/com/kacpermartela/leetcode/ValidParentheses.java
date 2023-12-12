package com.kacpermartela.leetcode;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    private static final Map<Character, Character> CHAR_PAIRS = Map.of(')', '(', '}', '{', ']', '[');

    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) return false;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (CHAR_PAIRS.containsValue(c)) {
                stack.push(c);
            } else if (CHAR_PAIRS.containsKey(c) && !stack.isEmpty()) {
                char poppedChar = stack.pop();
                if (CHAR_PAIRS.get(c) != poppedChar) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
