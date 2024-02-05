package com.kacpermartela.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InvertBinaryTreeTest {

    @Test
    void example1() {
        var root = new TreeNode(
                4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        var expected = new TreeNode(
                4,
                new TreeNode(7, new TreeNode(9), new TreeNode(6)),
                new TreeNode(2, new TreeNode(3), new TreeNode(1)));
        var actual = InvertBinaryTree.invertTree(root);
        assertEquals(expected, actual);
    }
}
