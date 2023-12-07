package com.kacpermartela.leetcode;

public class WaterContainers {
    public static int maxArea(int[] height) {
        int leftPointer = 0;
        int rightPointer = height.length - 1;

        int maxArea = 0;

        while (leftPointer < rightPointer) {
            int w = rightPointer - leftPointer;
            int h = Math.min(height[leftPointer], height[rightPointer]);
            int area = w * h;
            maxArea = Math.max(maxArea, area);
            if (height[leftPointer] < height[rightPointer]) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return maxArea;
    }
}
