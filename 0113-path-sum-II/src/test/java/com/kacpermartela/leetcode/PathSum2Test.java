package com.kacpermartela.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PathSum2Test {

    @Test
    void test() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        Assertions.assertThat(PathSum2.pathSum(root, 22))
                .containsExactlyInAnyOrder(List.of(5, 4, 11, 2), List.of(5, 8, 4, 5));
    }
}
