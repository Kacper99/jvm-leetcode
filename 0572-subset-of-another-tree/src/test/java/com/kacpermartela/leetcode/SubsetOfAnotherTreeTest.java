package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SubsetOfAnotherTreeTest {

    @Test
    void testIsSubtree() {
        TreeNode root = new TreeNode(3);
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(5);
        TreeNode leftLeft = new TreeNode(1);
        TreeNode leftRight = new TreeNode(2);
        root.left = left;
        root.right = right;
        left.left = leftLeft;
        left.right = leftRight;

        TreeNode subRoot = new TreeNode(4);
        TreeNode subLeft = new TreeNode(1);
        TreeNode subRight = new TreeNode(2);
        subRoot.left = subLeft;
        subRoot.right = subRight;

        assertThat(SubsetOfAnotherTree.isSubtree(root, subRoot)).isTrue();
    }
}
