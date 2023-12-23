package com.kacpermartela.leetcode;

public class MinInSortedRotatedArray {

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int lowest = nums[(right + left) / 2];
        while (left <= right) {
            int mid = (right + left) / 2;
            lowest = Math.min(lowest, nums[mid]);
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lowest;
    }
}
