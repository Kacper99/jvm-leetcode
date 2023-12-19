package com.kacpermartela.leetcode;

public class MatrixBinarySearch {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int topRow = 0;
        int bottomRow = matrix.length - 1;

        while (topRow <= bottomRow) {
            int middleRowIndex = mid(topRow, bottomRow);

            int[] row = matrix[middleRowIndex];

            int rowLow = row[0];
            int rowHigh = row[row.length - 1];
            if (target < rowLow) {
                bottomRow = middleRowIndex - 1;
            } else if (target > rowHigh) {
                topRow = middleRowIndex + 1;
            } else {
                return binarySearch(row, target);
            }
        }
        return false;
    }

    private static boolean binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = mid(left, right);
            if (target < nums[middle]) {
                right = middle - 1;
            } else if (target > nums[middle]) {
                left = middle + 1;
            } else {
                return true;
            }
        }

        return false;
    }

    private static int mid(int left, int right) {
        return left + (right - left) / 2;
    }
}
