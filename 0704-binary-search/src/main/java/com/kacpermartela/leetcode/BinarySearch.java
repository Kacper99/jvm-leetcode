package com.kacpermartela.leetcode;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
