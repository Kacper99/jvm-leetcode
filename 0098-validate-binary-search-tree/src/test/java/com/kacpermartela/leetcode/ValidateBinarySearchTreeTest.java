package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ValidateBinarySearchTreeTest {

    @Test
    void testIsValidBST() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        assertThat(ValidateBinarySearchTree.isValidBST(root)).isTrue();
    }

    @Test
    void foo() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(7);
        assertThat(ValidateBinarySearchTree.isValidBST(root)).isFalse();
    }
}
