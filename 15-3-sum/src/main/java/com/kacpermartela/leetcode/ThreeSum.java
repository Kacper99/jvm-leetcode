package com.kacpermartela.leetcode;

import java.util.*;

public class ThreeSum {

    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        Set<List<Integer>> results = new HashSet<>();

        for (int left = 0; left < nums.length - 2; left++) {
            int middle = left + 1;
            int right = nums.length - 1;
            while (middle < right) {
                int sum = nums[left] + nums[middle] + nums[right];
                if (sum < 0) {
                    middle++;
                } else if (sum > 0) {
                    right--;
                } else {
                    results.add(List.of(nums[left], nums[middle], nums[right]));
                    middle++;
                }
            }
        }

        return results.stream().toList();
    }
}
