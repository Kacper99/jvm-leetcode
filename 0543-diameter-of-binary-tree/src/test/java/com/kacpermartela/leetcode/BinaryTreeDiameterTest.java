package com.kacpermartela.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTreeDiameterTest {

    @Test
    void example1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        assertEquals(3, BinaryTreeDiameter.diameterOfBinaryTree(root));
    }

    @Test
    void example2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        assertEquals(1, BinaryTreeDiameter.diameterOfBinaryTree(root));
    }
}
