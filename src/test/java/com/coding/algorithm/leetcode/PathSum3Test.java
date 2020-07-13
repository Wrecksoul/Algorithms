package com.coding.algorithm.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author mengxiangzhe
 * @date 2020/2/5
 */
public class PathSum3Test {

    @Test
    public void pathSum() {
        TreeNode t1 = new TreeNode(10);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(-3);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(2);
        TreeNode t6 = new TreeNode(11);
        TreeNode t7 = new TreeNode(3);
        TreeNode t8 = new TreeNode(-2);
        TreeNode t9 = new TreeNode(1);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.right = t6;
        t4.left = t7;
        t4.right = t8;
        t5.right = t9;
        PathSum3 test = new PathSum3();
        assertEquals(3, test.pathSum(t1, 8));

        TreeNode t21 = new TreeNode(5);
        TreeNode t22 = new TreeNode(4);
        TreeNode t23 = new TreeNode(8);
        TreeNode t24 = new TreeNode(11);
        TreeNode t25 = new TreeNode(13);
        TreeNode t26 = new TreeNode(4);
        TreeNode t27 = new TreeNode(7);
        TreeNode t28 = new TreeNode(2);
        TreeNode t29 = new TreeNode(5);
        TreeNode t210 = new TreeNode(1);

        t21.left = t22;
        t21.right = t23;
        t22.left = t24;
        t23.left = t25;
        t23.right = t26;
        t24.left = t27;
        t24.right = t28;
        t25.left = t29;
        t25.right = t210;
        assertEquals(3, test.pathSum(t21, 22));

        TreeNode t31 = new TreeNode(1);
        TreeNode t32 = new TreeNode(-2);
        TreeNode t33 = new TreeNode(-3);
        TreeNode t34 = new TreeNode(1);
        TreeNode t35 = new TreeNode(3);
        TreeNode t36 = new TreeNode(-2);
        TreeNode t37 = new TreeNode(-1);

        t31.left = t32;
        t31.right = t33;
        t32.left = t34;
        t32.right = t35;
        t33.left = t36;
        t34.left = t37;

        assertEquals(1, test.pathSum(t31, 3));
        assertEquals(4, test.pathSum(t31, -1));
    }
}