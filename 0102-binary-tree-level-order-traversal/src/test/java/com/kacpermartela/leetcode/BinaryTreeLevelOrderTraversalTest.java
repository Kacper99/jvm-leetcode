package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class BinaryTreeLevelOrderTraversalTest {

    @Test
    void testLevelOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        var actual = BinaryTreeLevelOrderTraversal.levelOrder(root);
        assertThat(actual).containsExactly(List.of(3), List.of(9, 20), List.of(15, 7));
    }

    @Test
    void testLevelOrder2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        var actual = BinaryTreeLevelOrderTraversal.levelOrder(root);
        assertThat(actual).containsExactly(List.of(1), List.of(2, 3), List.of(4, 5));
    }
}
