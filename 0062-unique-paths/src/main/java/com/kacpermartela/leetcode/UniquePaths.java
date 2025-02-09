package com.kacpermartela.leetcode;

public class UniquePaths {

    public static int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        return helper(0, 0, m, n, memo);
    }

    public static int helper(int currentM, int currentN, int m, int n, int[][] memo) {
        System.out.println("At " + currentM + " " + currentN);
        if (memo[currentM][currentN] != 0) {
            return memo[currentM][currentN];
        }
        if (currentM == m - 1 && currentN == n - 1) {
            return 1;
        }
        if (currentM < m - 1 && currentN < n - 1) {
            final var i = helper(currentM + 1, currentN, m, n, memo) + helper(currentM, currentN + 1, m, n, memo);
            memo[currentM][currentN] = i;
            return i;
        } else if (currentM < m - 1) {
            final var i = helper(currentM + 1, currentN, m, n, memo);
            memo[currentM][currentN] = i;
            return i;
        } else {
            final var i = helper(currentM, currentN + 1, m, n, memo);
            memo[currentM][currentN] = i;
            return i;
        }
    }
}
