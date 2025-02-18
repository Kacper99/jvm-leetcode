package com.kacpermartela.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CountGoodNodesInBinaryTree {

    public static int goodNodes(TreeNode root) {
        final var pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        return helper(root, pq);
    }

    public static int helper(TreeNode root, PriorityQueue<Integer> pq) {
        if (root == null) {
            return 0;
        }
        int val = root.val;
        Integer peek = pq.peek();
        pq.add(val);
        if (peek == null || val >= peek) {
            return 1 + helper(root.left, new PriorityQueue<>(pq)) + helper(root.right, new PriorityQueue<>(pq));
        } else {
            return helper(root.left, new PriorityQueue<>(pq)) + helper(root.right, new PriorityQueue<>(pq));
        }
    }
}
