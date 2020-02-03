package com.coding.algorithm.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2020/2/2
 */
public class InvertBinaryTreeTest {

    @Test
    public void invertTree() {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);
        TreeNode t9 = new TreeNode(9);

        t4.left = t2;
        t4.right = t7;
        t2.left = t1;
        t2.right = t3;
        t7.left = t6;
        t7.right = t9;

        InvertBinaryTree test = new InvertBinaryTree();
        TreeNode treeNode = test.invertTree(t4);
    }

//    private int[] front(TreeNode root) {
//
//    }
//
//    private List<Integer> front1(TreeNode root) {
//        List<Integer> list = new ArrayList<>();
//        if (root != null) {
//            list.add(root.val);
//            if (root.left != null) {
//                list.add(root.left.val);
//            }
//            if (root.right != null) {
//                list.add(root.right.val);
//            }
//        }
//        list.addAll(front1(root.left));
//        list.addAll(front1(root.right));
//    }
}