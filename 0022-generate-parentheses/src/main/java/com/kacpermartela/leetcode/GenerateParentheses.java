package com.kacpermartela.leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static List<String> generateParenthesis(int n) {
        final var strings = new ArrayList<String>();
        helper(n, strings, "", 0, 0);
        return strings;
    }

    public static void helper(
            int n, List<String> results, String combination, int openingBrackets, int closingBrackets) {
        System.out.println(combination);
        if (combination.length() == n * 2) {
            results.add(combination);
        }
        if (openingBrackets < n) {
            helper(n, results, combination + "(", openingBrackets + 1, closingBrackets);
        }
        if (closingBrackets < openingBrackets) {
            helper(n, results, combination + ")", openingBrackets, closingBrackets + 1);
        }
    }
}
