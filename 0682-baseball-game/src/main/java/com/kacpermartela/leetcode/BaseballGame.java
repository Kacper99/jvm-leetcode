package com.kacpermartela.leetcode;

import java.util.Stack;

public class BaseballGame {
    public static int calPoints(String[] operations) {
        Stack<Integer> pointsScore = new Stack<>();
        for (String op : operations) {
            switch (op) {
                case "+" -> {
                    int res = pointsScore.get(pointsScore.size() - 1) + pointsScore.get(pointsScore.size() - 2);
                    pointsScore.push(res);
                }
                case "D" -> {
                    int res = pointsScore.peek() * 2;
                    pointsScore.push(res);
                }
                case "C" -> pointsScore.pop();
                default -> pointsScore.push(Integer.parseInt(op));
            }
        }
        return pointsScore.stream().reduce(0, Integer::sum);
    }
}
