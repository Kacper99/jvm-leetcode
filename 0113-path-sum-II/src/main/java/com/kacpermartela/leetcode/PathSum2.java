package com.kacpermartela.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return List.of();
        }

        var validPaths = new ArrayList<List<Integer>>();
        helper(root, targetSum, new ArrayList<>(), validPaths);
        return validPaths;
    }

    public static void helper(TreeNode root, int targetSum, List<Integer> currentPath, List<List<Integer>> validPaths) {
        System.out.println("At %s with current path of %s".formatted(root.toString(), currentPath.toString()));
        if (root.left == null && root.right == null) {
            currentPath.add(root.val);
            final int sum = currentPath.stream().mapToInt(Integer::intValue).sum();
            if (sum == targetSum) {
                validPaths.add(currentPath);
            }
        }
        if (root.left != null) {
            List<Integer> currentPathClone = new ArrayList<>(currentPath);
            currentPathClone.add(root.val);
            helper(root.left, targetSum, currentPathClone, validPaths);
        }
        if (root.right != null) {
            List<Integer> currentPathClone = new ArrayList<>(currentPath);
            currentPathClone.add(root.val);
            helper(root.right, targetSum, currentPathClone, validPaths);
        }
    }
}
