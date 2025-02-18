package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BalancedBinaryTreeTest {

    @Test
    void testBalancedBinaryTree() {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        TreeNode rightLeft = new TreeNode(15);
        TreeNode rightRight = new TreeNode(7);
        root.left = left;
        root.right = right;
        right.left = rightLeft;
        right.right = rightRight;
        assertThat(BalancedBinaryTree.isBalanced(root)).isTrue();
    }

    @Test
    void testUnbalancedBinaryTree() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        TreeNode leftLeft = new TreeNode(3);
        TreeNode leftRight = new TreeNode(3);
        TreeNode leftLeftLeft = new TreeNode(4);
        TreeNode leftLeftRight = new TreeNode(4);
        root.left = left;
        root.right = right;
        left.left = leftLeft;
        left.right = leftRight;
        leftLeft.left = leftLeftLeft;
        leftLeft.right = leftLeftRight;
        assertThat(BalancedBinaryTree.isBalanced(root)).isFalse();
    }
}
