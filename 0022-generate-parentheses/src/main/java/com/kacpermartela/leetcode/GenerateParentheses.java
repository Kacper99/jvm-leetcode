package com.kacpermartela.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class GenerateParentheses {

    public static List<String> generateParenthesis(int n) {
        final var strings = new ArrayList<String>();
        helper(n, strings, "", 0, 0);
        return strings;
    }

    public static void helper(
            int n, List<String> results, String combination, int openingBrackets, int closingBrackets) {
        if (combination.length() == n * 2) {
            if (isValid(combination)) {
                results.add(combination);
            }
        }
        if (openingBrackets < n) {
            helper(n, results, combination + "(", openingBrackets + 1, closingBrackets);
        }
        if (closingBrackets < n) {
            helper(n, results, combination + ")", openingBrackets, closingBrackets + 1);
        }
    }

    private static final Map<Character, Character> CHAR_PAIRS = Map.of(')', '(');

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
