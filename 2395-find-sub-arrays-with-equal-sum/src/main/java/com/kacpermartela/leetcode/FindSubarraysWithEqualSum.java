package com.kacpermartela.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindSubarraysWithEqualSum {

    public static boolean findSubarrays(int[] nums) {
        Set<Integer> sums = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            final boolean isNewSum = sums.add(nums[i] + nums[i + 1]);
            if (!isNewSum) {
                return true;
            }
        }
        return false;
    }
}
