package com.kacpermartela.leetcode;

/**
 * Constraints:
 * <ul>
 *     <li>All node values are unique
 * </ul>
 * <p>
 * Tree is a BST:
 * <ul>
 *     <li>BST always have values less than root on the left and greater than on the right
 * </ul>
 */
public class LowestCommonAncestor {

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode[] res = new TreeNode[1];
        helper(root, p, q, res);
        return res[0];
    }

    public static void helper(TreeNode root, TreeNode p, TreeNode q, TreeNode[] res) {
        if (root == null) {
            return;
        }
        if ((root.val >= p.val && root.val <= q.val) || (root.val <= p.val && root.val >= q.val)) {
            res[0] = root;
        } else {
            helper(root.left, p, q, res);
            helper(root.right, p, q, res);
        }
    }
}
