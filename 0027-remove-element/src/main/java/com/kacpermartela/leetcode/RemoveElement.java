package com.kacpermartela.leetcode;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer < rightPointer) {
            if (nums[leftPointer] == val) {
                int temp = nums[leftPointer];
                nums[leftPointer] = nums[rightPointer];
                nums[rightPointer] = temp;
                rightPointer--;
            } else {
                leftPointer++;
            }
        }
        return leftPointer;
    }
}
