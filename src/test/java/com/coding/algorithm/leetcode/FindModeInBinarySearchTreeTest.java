package com.coding.algorithm.leetcode;

import com.coding.algorithm.leetcode.tool.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author mengxiangzhe
 * @date 2020/7/14
 */
public class FindModeInBinarySearchTreeTest {

    @Test
    public void findMode() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(2);

        t1.left = t2;
        t2.right = t3;

        FindModeInBinarySearchTree test = new FindModeInBinarySearchTree();
        int[] mode = test.findMode(t1);
        assertArrayEquals(new int[]{2}, mode);
    }
}