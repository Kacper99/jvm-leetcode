package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class BinaryTreeRightSideViewTest {

    @Test
    void testRightSideView() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);

        var actual = BinaryTreeRightSideView.rightSideView(root);
        assertThat(actual).containsExactly(1, 3, 4);
    }
}
