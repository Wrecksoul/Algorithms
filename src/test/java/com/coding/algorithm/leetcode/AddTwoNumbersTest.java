package com.coding.algorithm.leetcode;

import com.coding.algorithm.leetcode.tool.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author mengxiangzhe
 * @date 2020/7/15
 */
public class AddTwoNumbersTest {

    @Test
    public void addTwoNumbers() {
        /* test 1*/
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;

        AddTwoNumbers test = new AddTwoNumbers();
        ListNode node = test.addTwoNumbers(node1, node4);

        Assert.assertTrue(node.val == 7);
        Assert.assertTrue(node.next.val == 0);
        Assert.assertTrue(node.next.next.val == 8);
        Assert.assertTrue(node.next.next.next == null);

        /* test 2*/
        ListNode node11 = new ListNode(5);
        ListNode node12 = new ListNode(5);
        ListNode node10 = test.addTwoNumbers(node11, node12);
        Assert.assertTrue(node10.val == 0);
        Assert.assertTrue(node10.next.val == 1);
        Assert.assertTrue(node10.next.next == null);


    }

    @Test
    public void addTwoNumbers2() {
        /* test 1*/
        AddTwoNumbers test = new AddTwoNumbers();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(9);
        ListNode node3 = new ListNode(9);
        node2.next = node3;
        ListNode node = test.addTwoNumbers(node1, node2);
        Assert.assertTrue(node.val == 0);
        Assert.assertTrue(node.next.val == 0);
        Assert.assertTrue(node.next.next.val == 1);
        Assert.assertTrue(node.next.next.next == null);
    }
}