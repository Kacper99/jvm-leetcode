package com.kacpermartela.leetcode;

public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int newIndex = 1;
        int previous = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != previous) {
                nums[newIndex] = nums[i];
                previous = nums[i];
                newIndex++;
            }
        }
        return newIndex;
    }
}
