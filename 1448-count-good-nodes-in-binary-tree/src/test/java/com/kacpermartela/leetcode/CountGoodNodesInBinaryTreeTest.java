package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CountGoodNodesInBinaryTreeTest {

    @Test
    void testGoodNodes() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        int expected = 4;
        int actual = CountGoodNodesInBinaryTree.goodNodes(root);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(4);

        int expected = 4;
        int actual = CountGoodNodesInBinaryTree.goodNodes(root);
        assertThat(actual).isEqualTo(expected);
    }
}
