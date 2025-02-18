package com.kacpermartela.leetcode;

public class BalancedBinaryTree {

    public static boolean isBalanced(TreeNode root) {
        final var helper = helper(root);
        return helper instanceof Result.Height;
    }

    private static Result helper(TreeNode treeNode) {
        if (treeNode == null) {
            return Result.Height.of(0);
        }
        Result left = helper(treeNode.left);
        Result right = helper(treeNode.right);

        if (left instanceof Result.Height(int leftHeight) && right instanceof Result.Height(int rightHeight)) {
            if (Math.abs(leftHeight - rightHeight) > 1) {
                return new Result.Unbalanced();
            }
            return Result.Height.of(Math.max(leftHeight, rightHeight) + 1);
        }

        return new Result.Unbalanced();
    }

    sealed interface Result {
        record Height(int val) implements Result {
            static Height of(int val) {
                return new Height(val);
            }
        }
        record Unbalanced() implements Result {}
    }
}
