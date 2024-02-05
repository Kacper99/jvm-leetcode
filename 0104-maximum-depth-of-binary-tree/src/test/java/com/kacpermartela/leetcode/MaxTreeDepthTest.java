package com.kacpermartela.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxTreeDepthTest {

    @Test
    void example1() {
        var root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        assertEquals(3, MaxTreeDepth.maxDepth(root));
    }
}
