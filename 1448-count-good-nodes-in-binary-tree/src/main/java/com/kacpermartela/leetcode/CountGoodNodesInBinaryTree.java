package com.kacpermartela.leetcode;

public class CountGoodNodesInBinaryTree {

    public static int goodNodes(TreeNode root) {
        return 1 + helper(root.left, root.val) + helper(root.right, root.val);
    }

    public static int helper(TreeNode root, int max) {
        if (root == null) {
            return 0;
        }
        int val = root.val;
        if (val >= max) {
            return 1 + helper(root.left, val) + helper(root.right, val);
        } else {
            return helper(root.left, max) + helper(root.right, max);
        }
    }
}
