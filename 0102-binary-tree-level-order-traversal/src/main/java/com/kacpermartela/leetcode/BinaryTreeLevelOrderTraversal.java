package com.kacpermartela.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return List.of();

        final var levels = new ArrayList<List<Integer>>();

        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.add(root);

        while (!bfs.isEmpty()) {

            // Pop all
            final var level = new ArrayList<>(bfs);
            bfs = new LinkedList<>();

            // Add level to result
            levels.add(level.stream().map(node -> node.val).toList());

            // Build next level in queue (Can be merged with the above into a single loop)
            // In fact could all be one for loop using the size of the queue as the iterator, that way we can pop and
            // push at the same time without using the emptiness of the queue as a signal for when we're done for a row
            for (TreeNode node : level) {
                if (node.left != null) bfs.add(node.left);
                if (node.right != null) bfs.add(node.right);
            }
        }
        return levels;
    }
}
