package com.coding.algorithm.leetcode;

/**
 * Google: 90% of our engineers use the software you wrote (Homebrew), <br/>
 * but you can’t invert a binary tree on a whiteboard so f*** off.
 *
 * @author mengxiangzhe
 * @date 2020/2/2
 */
public class InvertBinaryTree {
    public TreeNode invertTree2(TreeNode root) {
        doInvertTree(root);
        return root;
    }

    private void doInvertTree(TreeNode root) {
        if (root != null) {
            TreeNode right = root.right;
            root.right = root.left;
            root.left = right;
            doInvertTree(root.left);
            doInvertTree(root.right);
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
