package com.kacpermartela.leetcode;

public class ConcatenateArray {
    public static int[] getConcatenation(int[] nums) {
        int[] newNums = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
            newNums[i + nums.length] = nums[i];
        }
        // System.gc(); // Having this line uses less memory but longer run time
        return newNums;
    }
}
