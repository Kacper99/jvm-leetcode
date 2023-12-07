package com.kacpermartela.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        record NumWithOriginalIndex(int num, int originalIndex) {}

        final var pq = new PriorityQueue<NumWithOriginalIndex>(Comparator.comparing(NumWithOriginalIndex::num, Integer::compareTo));
        for (int i = 0; i < nums.length; i++) {
            pq.add(new NumWithOriginalIndex(nums[i], i));
        }
        final var sortedArray = new NumWithOriginalIndex[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sortedArray[i] = pq.poll();
        }

        int leftPointer = 0;
        int rightPointer = sortedArray.length - 1;

        while (leftPointer < rightPointer) {
            int sum = sortedArray[leftPointer].num + sortedArray[rightPointer].num;
            if (sum < target) {
                leftPointer++;
            } else if (sum > target) {
                rightPointer--;
            } else {
                return new int[] {sortedArray[leftPointer].originalIndex, sortedArray[rightPointer].originalIndex};
            }
        }
        return new int[0];
    }
}
