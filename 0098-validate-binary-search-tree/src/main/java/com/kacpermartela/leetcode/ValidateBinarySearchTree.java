package com.kacpermartela.leetcode;

public class ValidateBinarySearchTree {

    public static boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean helper(TreeNode root, long left, long right) {
        if (root == null) {
            return true;
        }
        if (left < root.val && root.val < right) {
            return helper(root.left, left, root.val) && helper(root.right, root.val, right);
        }
        return false;
    }
}
