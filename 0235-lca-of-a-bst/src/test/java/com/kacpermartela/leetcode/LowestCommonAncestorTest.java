package com.kacpermartela.leetcode;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class LowestCommonAncestorTest {

    @Test
    void testLowestCommonAncestor() {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        TreeNode p = root.left;
        TreeNode q = root.right;
        TreeNode expected = root;
        TreeNode actual = LowestCommonAncestor.lowestCommonAncestor(root, p, q);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testLowestCommonAncestor2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);

        TreeNode p = root;
        TreeNode q = root.left;
        TreeNode expected = root;
        TreeNode actual = LowestCommonAncestor.lowestCommonAncestor(root, p, q);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testLowestCommonAncestor3() {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);

        TreeNode p = root;
        TreeNode q = root.right;
        TreeNode expected = root;
        TreeNode actual = LowestCommonAncestor.lowestCommonAncestor(root, p, q);
        assertThat(actual).isEqualTo(expected);
    }
}
