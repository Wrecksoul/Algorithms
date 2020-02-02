package com.coding.algorithm.leetcode;

import com.coding.algorithm.leetcode.tool.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * @author mengxiangzhe
 * @date 2020/2/1
 */
public class ReverseLinkedListTest {

    @Test
    public void reverseList() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ReverseLinkedList test = new ReverseLinkedList();
        int[] expectArr1 = new int[]{1, 2, 3, 4, 5};

        assertTrue(isEqualList(l1, expectArr1));
        int[] expectArr2 = new int[]{5, 4, 3, 2, 1};

        ListNode listNode = test.reverseList(l1);
        assertTrue(isEqualList(listNode, expectArr2));
    }

    @Test
    public void reverseList2() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ReverseLinkedList test = new ReverseLinkedList();
        int[] expectArr1 = new int[]{1, 2, 3, 4, 5};

        assertTrue(isEqualList(l1, expectArr1));
        int[] expectArr2 = new int[]{5, 4, 3, 2, 1};

        ListNode listNode = test.reverseList2(l1);
        assertTrue(isEqualList(listNode, expectArr2));
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