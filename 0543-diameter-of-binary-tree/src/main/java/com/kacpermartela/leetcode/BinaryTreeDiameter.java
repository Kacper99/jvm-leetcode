package com.kacpermartela.leetcode;

public class BinaryTreeDiameter {

    public static int diameterOfBinaryTree(TreeNode root) {
        ResultHolder resultHolder = new ResultHolder();
        diameter(root, resultHolder);
        return resultHolder.val;
    }

    public static int diameter(TreeNode root, ResultHolder resultHolder) {
        if (root == null) return 0;

        int left = diameter(root.left, resultHolder);
        int right = diameter(root.right, resultHolder);
        resultHolder.val = Math.max(resultHolder.val, left + right);

        return 1 + Math.max(left, right);
    }

    private static class ResultHolder {
        int val = 0;
    }
}
