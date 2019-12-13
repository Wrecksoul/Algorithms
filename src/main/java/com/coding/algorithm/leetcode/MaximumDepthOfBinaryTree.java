package com.coding.algorithm.leetcode;


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


/*Definition for a binary tree node.*/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
