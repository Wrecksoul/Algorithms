package com.coding.algorithm.leetcode;


import com.coding.algorithm.leetcode.tool.TreeNode;

/**
 * @author mengxiangzhe
 * @date 2019/12/13
 */
public class MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;

        return 1+Math.max(maxDepth(left), maxDepth(right));
    }
}
