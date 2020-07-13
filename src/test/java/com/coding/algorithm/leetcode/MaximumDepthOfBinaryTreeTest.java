package com.coding.algorithm.leetcode;

import com.coding.algorithm.leetcode.tool.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2019/12/13
 */
public class MaximumDepthOfBinaryTreeTest {

    @Test
    public void maxDepth() {
        MaximumDepthOfBinaryTree maximumDepthOfBinaryTree = new MaximumDepthOfBinaryTree();
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        root.left = node1;
        root.right = node2;

        TreeNode node5 = new TreeNode(15);
        node2.left = node5;
        TreeNode node6 = new TreeNode(7);
        node2.right = node6;

        assertTrue(maximumDepthOfBinaryTree.maxDepth(root) == 3);
    }
}