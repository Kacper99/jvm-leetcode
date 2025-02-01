package com.kacpermartela.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BinaryTreePathsTest {

    @Test
    void test() {
        TreeNode root = new TreeNode(1);
        Assertions.assertThat(BinaryTreePaths.binaryTreePaths(root)).containsExactlyInAnyOrder("1");
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        Assertions.assertThat(BinaryTreePaths.binaryTreePaths(root)).containsExactlyInAnyOrder("1->2");
    }

    @Test
    void test3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        Assertions.assertThat(BinaryTreePaths.binaryTreePaths(root)).containsExactlyInAnyOrder("1->2->5", "1->3");
    }
}
