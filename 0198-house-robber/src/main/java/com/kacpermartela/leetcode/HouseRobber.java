package com.kacpermartela.leetcode;

public class HouseRobber {
    public static int rob(int[] nums) {
        return helper(nums, 0, 0);
    }

    public static int helper(int[] nums, int totalSoFar, int index) {
        if (index < nums.length) {
            return Math.max(helper(nums, totalSoFar + nums[index], index + 2), helper(nums, totalSoFar, index + 1));
        }

        return totalSoFar;
    }
}
