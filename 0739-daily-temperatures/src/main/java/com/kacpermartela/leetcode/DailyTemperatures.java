package com.kacpermartela.leetcode;

import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        record TempDay(int temp, int index) {}
        final var temps = new Stack<TempDay>();
        final var res = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!temps.isEmpty() && temperatures[i] > temps.peek().temp) {
                final var pop = temps.pop();
                if (temperatures[i] > pop.temp) {
                    res[pop.index] = i - pop.index;
                }
            }
            temps.push(new TempDay(temperatures[i], i));
        }
        return res;
    }
}
