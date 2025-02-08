package com.kacpermartela.leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static int evalRPN(String[] tokens) {
        final var strings = new Stack<Integer>();
        for (String token : tokens) {
            switch (token) {
                case "*" -> strings.push(strings.pop() * strings.pop());
                case "/" -> {
                    final var a = strings.pop();
                    final var b = strings.pop();
                    strings.push(b / a);
                }
                case "+" -> strings.push(strings.pop() + strings.pop());
                case "-" -> {
                    final var a = strings.pop();
                    final var b = strings.pop();
                    strings.push(b - a);
                }
                default -> strings.push(Integer.parseInt(token));
            }
        }

        return strings.pop();
    }
}
