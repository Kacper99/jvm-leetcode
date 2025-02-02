package com.kacpermartela.leetcode;

import static com.kacpermartela.leetcode.BinaryTreeInOrderTraversal.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTreeInOrderTraversalTest {

    @Test
    void test() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        assertThat(inorderTraversal(root)).containsExactly(1, 3, 2);
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        assertThat(inorderTraversal(root)).containsExactly(2, 1);
    }
}
