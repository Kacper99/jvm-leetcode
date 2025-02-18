package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SameTreeTest {

    @Test
    void testSameTree() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;

        TreeNode root2 = new TreeNode(1);
        TreeNode left2 = new TreeNode(2);
        TreeNode right2 = new TreeNode(3);
        root2.left = left2;
        root2.right = right2;

        assertThat(SameTree.isSameTree(root, root2)).isTrue();
    }

    @Test
    void testDifferentTree() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;

        TreeNode root2 = new TreeNode(1);
        TreeNode left2 = new TreeNode(2);
        TreeNode right2 = new TreeNode(3);
        TreeNode right2Right = new TreeNode(4);
        root2.left = left2;
        root2.right = right2;
        right2.right = right2Right;

        assertThat(SameTree.isSameTree(root, root2)).isFalse();
    }
}
