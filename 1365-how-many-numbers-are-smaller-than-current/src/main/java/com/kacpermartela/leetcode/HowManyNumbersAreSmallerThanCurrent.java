package com.kacpermartela.leetcode;

import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class HowManyNumbersAreSmallerThanCurrent {

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        final Map<Integer, Integer> counter = new HashMap<>();
        for (int num : nums) {
            counter.merge(num, 1, Integer::sum);
        }

        int[] output = new int[nums.length];
        Map<Integer, Integer> memo = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            var countOfNumbersThatAreSmaller = memo.get(nums[i]);
            if (countOfNumbersThatAreSmaller == null) {
                countOfNumbersThatAreSmaller = help(nums[i], counter);
                memo.put(nums[i], countOfNumbersThatAreSmaller);
            }
            output[i] = countOfNumbersThatAreSmaller;
        }
        return output;
    }

    private static int help(int num, Map<Integer, Integer> counter) {
        return counter.entrySet().stream()
                .filter(entry -> entry.getKey() < num)
                .mapToInt(Map.Entry::getValue)
                .sum();
    }
}
