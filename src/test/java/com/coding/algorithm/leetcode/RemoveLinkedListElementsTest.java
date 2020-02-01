package com.coding.algorithm.leetcode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author mengxiangzhe
 * @date 2020/2/1
 */
public class RemoveLinkedListElementsTest {

    @Test
    public void removeElements() {
        RemoveLinkedListElements test = new RemoveLinkedListElements();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(6);
        ListNode l4 = new ListNode(3);
        ListNode l5 = new ListNode(4);
        ListNode l6 = new ListNode(5);
        ListNode l7 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        int[] expectArr1 = new int[]{1, 2, 6, 3, 4, 5, 6};
        Assert.assertTrue(isEqualList(l1, expectArr1));
        ListNode listNode = test.removeElements(l1, 6);
        int[] expectArr2 = new int[]{1, 2, 3, 4, 5};

        Assert.assertTrue(isEqualList(listNode, expectArr2));
    }

    private boolean isEqualList(ListNode listNode, int[] expect) {
        int i = 0;
        while (listNode != null) {
            if (listNode.val != expect[i++]) {
                return false;
            }
            listNode = listNode.next;
        }
        return true;
    }
}