package com.kacpermartela.leetcode;

public class SameTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null) {
            if (p.val == q.val) {
                return isSameTree(q.left, p.left) && isSameTree(q.right, p.right);
            }
        }
        return false;
    }
}
