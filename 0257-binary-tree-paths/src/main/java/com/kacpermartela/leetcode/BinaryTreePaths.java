package com.kacpermartela.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    public static List<String> binaryTreePaths(TreeNode root) {
        var paths = new ArrayList<String>();
        helper(root, "", paths);
        return paths;
    }

    private static void helper(TreeNode root, String path, List<String> paths) {
        System.out.println("At node %s, current path %s".formatted(root.toString(), path + root.val));
        if (root.left == null && root.right == null) {
            paths.add(path + root.val);
        }
        if (root.left != null) {
            helper(root.left, path + root.val + "->", paths);
        }
        if (root.right != null) {
            helper(root.right, path + root.val + "->", paths);
        }
    }
}
