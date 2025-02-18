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
        if (Math.max(p.val, q.val)
                < root.val) { // If both p and q are less than the root then they LCA must be somewhere on the left side
            return lowestCommonAncestor(root.left, p, q);
        } else if (Math.min(p.val, q.val)
                > root.val) { // If both p and q are greater than the root then they LCA must be somewhere on the right
            // side
            return lowestCommonAncestor(root.right, p, q);
        } else { // Otherwise, we're at the lowest common ancestor
            return root;
        }
    }
}
